package com.alibou.security.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {

    private static final String SECRET_KEY = "33743677397A24432646294A404E635166546A576E5A7234753778214125442A"; //generated externally; can move to appplication properties
    public String extractUsername(String token) {
        return extractClaim(token, Claims::getSubject);//the Subject should be the usrname or usremail/the subj of the token
    }

//  EXTRACT THE TOKEN

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver){
        final Claims claims = extractAllClaims(token); //extract all claims from my token
        return claimsResolver.apply(claims); //I want to return the function which I pass as a parameter and apply all the claims that we have
    }
//    GENERATE THE TOKEN

    public String generateToken(UserDetails userDetails) { //this is for generate without extraclaims or directly from userDetails
        return generateToken(new HashMap<>(), userDetails);
    }

    public String generateToken(
            Map<String, Object> extraClaims, //this is if I want to pass extra info to store within my token
            UserDetails userDetails
    ){
        return Jwts
                .builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();
    }

//     CHECK TOKEN VALIDITY
    public boolean isTokenValid(String token, UserDetails userDetails) {
        final String username = extractUsername(token);
        return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    private Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }


    private Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())/*this return the sign in key to ensure that the sender of jwt remains the same used
                                                in conjunction with the signin algo specified in the jwt header*/
                .build()
                .parseClaimsJws(token)
                .getBody(); //getting all the claims within the token parameter passed
    }

    private Key getSignInKey() { //extract the signin key
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
