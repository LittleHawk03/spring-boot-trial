package net.java.student.Entity;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "So_TC")
    private Integer So_TC;

    @Column(name = "Ma_Mon")
    private String Ma_Mon;

    public Integer getId() {
        return id;
    }

    @OneToOne
    @JoinColumn(name = "point_id",referencedColumnName = "id")
    private Point point;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSo_TC() {
        return So_TC;
    }

    public void setSo_TC(Integer so_TC) {
        So_TC = so_TC;
    }

    public String getMa_Mon() {
        return Ma_Mon;
    }

    public void setMa_Mon(String ma_Mon) {
        Ma_Mon = ma_Mon;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
