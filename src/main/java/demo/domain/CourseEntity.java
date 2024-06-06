package demo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "COURSE")
@Getter
@Setter
@Builder
public class CourseEntity {
    @Id
    @Column(name = "cno")
    private String cno;

    @Column(name = "cname")
    private String cname;

    @Column(name = "credit")
    private String credit;

    @Column(name = "sessions")
    private String sessions;

    @OneToMany(mappedBy = "course")
    private List<EnrollEntity> enrollments;
}