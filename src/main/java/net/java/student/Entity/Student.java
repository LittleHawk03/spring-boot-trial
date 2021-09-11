package net.java.student.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "MaSV")
    private String MaSV;
    @Column(name = "pass")
    private String pass;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id",referencedColumnName = "id")
    List<Subject> subjects = new ArrayList<>();



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
