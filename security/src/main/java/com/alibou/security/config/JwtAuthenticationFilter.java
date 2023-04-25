package com.alibou.security.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
@RequiredArgsConstructor //crea un costruttore con tutti i parametri final
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtService jwtService;
    private final UserDetailsService userDetailsService; //create o Bean or implementation to inject and fetch our data from db
    @Override
    protected void doFilterInternal(
            @NonNull HttpServletRequest request,
            @NonNull HttpServletResponse response,
            @NonNull FilterChain filterChain
    ) throws ServletException, IOException {
      final String authHeader = request.getHeader("Authorization");
      final String jwt;
      final String userEmail;
      if (authHeader == null ||!authHeader.startsWith("Bearer ")){
          filterChain.doFilter(request, response);//passa al next filter
          return;
      }
      jwt = authHeader.substring(7);//bearer + space = 7
        userEmail = jwtService.extractUsername(jwt);// extract the userEmail from jwt token
        if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);//if get user details from db
            if (jwtService.isTokenValid(jwt, userDetails)) { //check if is valid or not
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken( //create an obj usernamepassauthtoken
                        userDetails, //pass usr-details
                        null, // credential
                        userDetails.getAuthorities() //pass authority as param
                );
                authToken.setDetails( //enforce authtoken with details of our request
                        new WebAuthenticationDetailsSource().buildDetails(request)
                );
                SecurityContextHolder.getContext().setAuthentication(authToken); //update authtoken
            }
        }
        filterChain.doFilter(request, response);
     }
}

