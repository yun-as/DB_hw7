package demo.domain;

import lombok.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name="STUDENT")
@Getter
@Setter
@Builder
public class StudentEntity {
    @Id
    @Column(name="sno")
    private String sno;

    @Column(name="pno")
    private String pno;

    @Column(name="sname")
    private String sname;

    @Column(name="year")
    private String year;

    @Column(name="dept")
    private String dept;
}
