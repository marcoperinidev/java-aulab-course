package it.aulab.learningplatform.dto;

import java.util.List;

import it.aulab.learningplatform.model.Lesson;
import it.aulab.learningplatform.model.Student;

public class CourseDTO {
    private Long id;
    private String name;
    private String description;
    private String teacherFirstname;
    private String teacherLastname;
    private String date;
    private List<Lesson> lessons;
    private List<Student> students;
    // private List<LessonDTO> lessons;
    // private List<StudentDTO> students;
    public CourseDTO() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTeacherFirstname() {
        return teacherFirstname;
    }
    public void setTeacherFirstname(String teacherFirstname) {
        this.teacherFirstname = teacherFirstname;
    }
    public String getTeacherLastname() {
        return teacherLastname;
    }
    public void setTeacherLastname(String teacherLastname) {
        this.teacherLastname = teacherLastname;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public List<Lesson> getLessons() {
        return lessons;
    }
    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
