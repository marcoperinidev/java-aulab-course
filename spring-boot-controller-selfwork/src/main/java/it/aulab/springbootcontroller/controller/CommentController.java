package it.aulab.springbootcontroller.controller;

import java.util.List;

import org.kie.kogito.flexible.example.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.CommentDTO;
import com.github.javaparser.ast.comments.Comment;

@Controller
@RequestMapping(value = "/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public @ResponseBody List<CommentDTO> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentDTO> getCommentById(@PathVariable Long id) {
        Comment comment = commentServiceImpl.getCommentById(id); // come esempio, assumiamo che il metodo per recuperare
                                                                 // il commento dalla classe CommentServiceImpl sia
                                                                 // getCommentById()
        CommentDTO commentDTO = commentMapper.toDto(comment);
        return ResponseEntity.ok(commentDTO);
    }

    @PostMapping
    public @ResponseBody CommentDTO createComment(@RequestBody CommentDTO commentDTO) {
        return commentService.createComment(commentDTO);
    }

    @PutMapping("/{id}")
    public @ResponseBody CommentDTO updateComment(@PathVariable("id") Long id, @RequestBody CommentDTO commentDTO) {
        return CommentService.updateComment(id, commentDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable("id") Long id) {
        commentService.deleteComment(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleException(ResourceNotFoundException e) {
        return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}