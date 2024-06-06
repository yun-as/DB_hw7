package demo.repository;

import demo.domain.LectureEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LectureRepository extends JpaRepository<LectureEntity, String > {
    @Override
    @Query(
            value = "select * from LECTURE",
            nativeQuery = true
    )
    List<LectureEntity> findAll();

    @Modifying
    @Transactional
    @Query(
            value = "insert into LECTURE(cno, pno, lec_time, room) values (:cno, :pno, :lec_time, :room)",
            nativeQuery = true
    )
    void saveOne(
            @Param("cno") String cno,
            @Param("pno") String pno,
            @Param("lec_time") String lec_time,
            @Param("room") String room
    );
}
