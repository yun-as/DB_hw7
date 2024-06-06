package demo.domain;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "COURSE")
@Getter
@Setter
@Builder
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cno")
    private String cno;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cname")
    private String cname;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit")
    private String credit;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sessions")
    private String sessions;
}