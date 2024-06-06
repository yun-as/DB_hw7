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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sno")
    private String sno;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cno")
    private String cno;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grade")
    private String grade;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam")
    private String exam;
}