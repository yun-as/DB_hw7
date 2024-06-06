package demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "PROFESSOR")
@Getter
@Setter
@Builder
public class ProfessorEntity {
    @Id
    @Column(name = "pno")
    private String pno;

    @Column(name = "pname")
    private String pname;

    @Column(name = "pmajor")
    private String pmajor;

    @Column(name = "pdept")
    private String pdept;
}