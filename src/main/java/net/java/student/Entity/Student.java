package net.java.student.Entity;

import org.springframework.web.bind.annotation.RequestMapping;

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

    @Column(name = "BirthDay")
    private String BirthDay;

    @Column(name = "Gender")
    private String Gender;

    @Column(name = "MaSV")
    private String MaSV;

    @Column(name = "Dan_Toc")
    private String DanToc;

    @Column(name = "Ma_Lop")
    private String MaLop;

    @Column(name = "Cccd")
    private String CCCD;

    @Column(name = "Address")
    private String Address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @OneToOne
    @JoinColumn(name = "class_id",referencedColumnName = "id")
    private Class aClass;







//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "cp_id",referencedColumnName = "id")
//    List<Subject> subjects = new ArrayList<>();



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

    public String getDanToc() {
        return DanToc;
    }

    public void setDanToc(String danToc) {
        DanToc = danToc;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

//    public List<Subject> getSubjects() {
//        return subjects;
//    }
//
//    public void setSubjects(List<Subject> subjects) {
//        this.subjects = subjects;
//    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
