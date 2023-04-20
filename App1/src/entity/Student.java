package entity;

//entity - all entites in equal in db table

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

//@Entity(name = "student_table")
// @Entity - database eke thiyena table eke name eka /*(name = "student_table")*/
@Entity // required (default - student)
/*@Table(name = "student_table") - optional*/
@DynamicUpdate
public class Student {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long studentId;
    @Column(name = "name", length = 45, nullable = false)
    //length = 45 => limit of length in the column
    // nullable = false => not null
    private String studentName;
    private double marks;

    public Student() {
    }

    public Student(long studentId, String studentName, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
