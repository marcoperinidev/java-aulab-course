package it.aulab.springbootcontroller.mapper;

import java.time.format.DateTimeFormatter;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import it.aulab.springbootcontroller.dto.CommentDTO;
import it.aulab.springbootcontroller.model.Comment;

@Component
public class CommentToCommentDTOMap extends PropertyMap<Comment, CommentDTO> {
    @Override
    protected void configure() {
        map().getPublishDate(source.getPublishDate().formatted(DateTimeFormatter.ISO_DATE));
    }
    @Configuration
    public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.addMappings(new CommentToCommentDTOMap());
        return modelMapper;
    }
}
}




