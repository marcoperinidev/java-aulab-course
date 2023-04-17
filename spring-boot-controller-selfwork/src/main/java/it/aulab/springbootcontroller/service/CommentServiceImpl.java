package it.aulab.springbootcontroller.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.dto.CommentDTO;

import it.aulab.springbootcontroller.model.Comment;
import it.aulab.springbootcontroller.repository.CommentRepository;
import mapper.CommentMapper;

@Service
public class CommentServiceImpl<CommentDTO, CommentMapper> implements CompletionService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<CommentDTO> getAllComments() {
        List<CommentDTO> dtos = new ArrayList<CommentDTO>();
        for (Comment comment : commentRepository.findAll()) {
            CommentDTO dto = commentMapper.toDto(comment);
            dtos.add(dto);
        }
        return dtos;
    }

    @Override
    public static CommentDTO getCommentById(Long id) {
        Optional<Comment> comment = commentRepository.findById(id);
        if (!comment.isPresent()) {
            throw new ResourceNotFoundException("Comment not found with id: " + id);
        }
        return commentMapper.toDto(comment.get());
    }

    @Override
    public CommentDTO createComment(CommentDTO commentDTO) {
        Comment comment = commentMapper.toEntity(commentDTO);
        comment = commentRepository.save(comment);
        return commentMapper.toDto(comment);
    }

    @Override
    public CommentDTO updateComment(Long id, CommentDTO commentDTO) {
        Optional<Comment> comment = commentRepository.findById(id);
        if (!comment.isPresent()) {
            throw new ResourceNotFoundException("Comment not found with id: " + id);
        }
        Comment updatedComment = commentMapper.toEntity(commentDTO);
        updatedComment.setId(id);
        updatedComment = commentRepository.save(updatedComment);
        return commentMapper.toDto(updatedComment);
    }

    @Override
    public void deleteComment(Long id) {
        Optional<Comment> comment = commentRepository.findById(id);
        if (!comment.isPresent()) {
            throw new ResourceNotFoundException("Comment not found with id: " + id);
        }
        commentRepository.deleteById(id);
    }


}