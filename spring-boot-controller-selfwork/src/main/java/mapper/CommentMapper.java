package mapper;

import org.springframework.stereotype.Component;
import it.aulab.springbootcontroller.model.Comment;

@Component
public class CommentMapper {

    public Comment toDto(Comment comment) {
        Comment dto = new Comment();
        dto.setId(comment.getId());
        dto.setText(comment.getText());
        dto.setPost(comment.getPost().getId());
        return dto;
    }

    public Comment toEntity(Comment dto) {
        Comment comment = new Comment();
        comment.setId(dto.getId());
        comment.setText(dto.getText());
        // non impostiamo il post, poiché non vogliamo che il client possa
        // creare o modificare il post associato a un commento
        return comment;
    }
}