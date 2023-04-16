package it.aulab.springbootcontroller.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import javax.management.relation.RelationNotFoundException;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aulab.springbootcontroller.dto.CreatePostDTO;
import it.aulab.springbootcontroller.dto.PostDTO;
import it.aulab.springbootcontroller.model.Post;
import it.aulab.springbootcontroller.repository.AuthorRepository;
import it.aulab.springbootcontroller.repository.PostRepository;

@Service
public class PostServiceImpl<X> implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<PostDTO> getAllPosts() {
        List<PostDTO> dtos = new ArrayList<PostDTO>();
        for (Post p : postRepository.findAll()) {
            PostDTO map = modelMapper.map(p, PostDTO.class);
            dtos.add(map);
        }
        return dtos;
    }

    @Override
    public PostDTO getPostById(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found with id " + id));
        return modelMapper.map(post, PostDTO.class);
    }

    @Override
    public void createPost(CreatePostDTO createPostDto) {
        Post post = modelMapper.map(createPostDto, Post.class);
        post.setAuthor(authorRepository.findById(post.getAuthor().getId()).get());
        postRepository.save(post);
    }

    @Override
    public void updatePost(Long id, CreatePostDTO createPostDto) {
        Post p;
        try {
            p = postRepository.findById(id)
                    .orElseThrow(() -> new RelationNotFoundException("Post not found with id " + id));
        } catch (RelationNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        p.setTitle(createPostDto.getTitle());
        p.setBody(createPostDto.getBody());
        p.setAuthor(authorRepository.findById(createPostDto.getAuthorId()).get());
        postRepository.save(post);
    }

    @Override
    public void deletePost(Long id) {
        Post post;
        try {
            post = postRepository.findById(id)
                    .orElseThrow(() -> new RelationNotFoundException("Post not found with id " + id));
        } catch (RelationNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        postRepository.delete(post);
    }

}
