package net.java.student.Entity;


import javax.persistence.*;

@Entity
@Table(name = "class")
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "MaLop")
    private String MaLop;
    @Column(name = "STT")
    private Integer STT;

    @OneToOne
    @JoinColumn(name = "schoolYear_id",referencedColumnName = "id")
    private SchoolYear schoolYear;

    @OneToOne
    @JoinColumn(name = "studyProgram_id",referencedColumnName = "id")
    private StudyProgram studyProgram;

    @OneToOne
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    private Department department;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public Integer getSTT() {
        return STT;
    }

    public void setSTT(Integer STT) {
        this.STT = STT;
    }

    public SchoolYear getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(SchoolYear schoolYear) {
        this.schoolYear = schoolYear;
    }

    public StudyProgram getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(StudyProgram studyProgram) {
        this.studyProgram = studyProgram;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
