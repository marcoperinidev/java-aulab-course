package it.aulab.springbootcontroller.dto;
public class CommentDTO {
    private Long id;
    private String text;
    private Long postId;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPublishDate(String string) {
        return getPublishDate(string);
    }
}