package it.aulab.springbootcontroller.dto;

public class AuthorDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer numberOfPost;
    
    public AuthorDTO() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getNumberOfPost() {
        return numberOfPost;
    }
    public void setNumberOfPost(Integer numberOfPost) {
        this.numberOfPost = numberOfPost;
    }
    
    
}
