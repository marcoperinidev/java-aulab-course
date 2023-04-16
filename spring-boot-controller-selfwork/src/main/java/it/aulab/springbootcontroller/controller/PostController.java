package it.aulab.springbootcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.aulab.springbootcontroller.service.PostService;
import it.aulab.springbootcontroller.dto.CreatePostDTO;
import it.aulab.springbootcontroller.dto.PostDTO;

@Controller
@RequestMapping(value = "posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public @ResponseBody List<PostDTO> getAll() {
        return PostService.getAllPosts();
    }

    @GetMapping("/{id}")
    public @ResponseBody PostDTO getById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @PostMapping
    public @ResponseBody void post(@RequestBody CreatePostDTO createPostDto) {
        postService.createPost(createPostDto);
    }

    @PutMapping("/{id}")
    public @ResponseBody void put(@PathVariable Long id, @RequestBody CreatePostDTO createPostDto) {
        postService.updatePost(id, createPostDto);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody void delete(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
