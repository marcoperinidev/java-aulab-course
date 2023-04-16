package it.aulab.springbootcontroller.service;

import java.util.List;

import it.aulab.springbootcontroller.dto.CreatePostDTO;
import it.aulab.springbootcontroller.dto.PostDTO;

public interface PostService {
    static List<PostDTO> getAllPosts() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllPosts'");
    }

    PostDTO getPostById(Long id);

    void createPost(CreatePostDTO createPostDto);

    void updatePost(Long id, CreatePostDTO createPostDto);

    void deletePost(Long id);

}
