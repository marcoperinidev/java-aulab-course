package it.aulab.springbootcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.aulab.springbootcontroller.dto.CommentDTO;
import it.aulab.springbootcontroller.model.Comment;
import it.aulab.springbootcontroller.repository.CommentRepository;

@RestController
@RequestMapping(value = "api/comments")
public class CommentRestController {
    
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<CommentDTO> getAll() {
        List<CommentDTO> dtos = new ArrayList<CommentDTO>();

        for (Comment c : commentRepository.findAll()) {
            CommentDTO dto = modelMapper.map(c, CommentDTO.class);
            dto.setPostTitle(c.getPost().getTitle()); // Aggiunge il titolo del post al DTO
            dtos.add(dto);
        }

        return dtos;
    }
}
