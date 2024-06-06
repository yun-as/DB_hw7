package demo.domain;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "ENROLL")
@Getter
@Setter
@Builder

public class EnrollEntity {
    @Id
    @Column(name = "sno")
    private String sno;

    @ManyToOne
    @JoinColumn(name = "sno", insertable = false, updatable = false)
    private StudentEntity student;

    @ManyToOne
    @JoinColumn(name = "cno", insertable = false, updatable = false)
    private CourseEntity course;

    @Column(name = "cno")
    private String cno;

    @Column(name = "grade")
    private String grade;

    @Column(name = "exam")
    private String exam;


}