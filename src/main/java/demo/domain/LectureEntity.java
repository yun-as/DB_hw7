package demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@RequiredArgsConstructor
@Entity(name = "LECTURE")
@Getter
@Setter
@Builder
public class LectureEntity {
    @Id
    @Column(name = "cno")
    private String cno;

    @Column(name = "pno")
    private String pno;

    @Column(name = "lec_time")
    private String lec_time;

    @Column(name = "room")
    private String room;
}