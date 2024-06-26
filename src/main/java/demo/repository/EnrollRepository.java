package demo.repository;

import demo.domain.EnrollEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnrollRepository extends JpaRepository<EnrollEntity, String > {
    @Override
    @Query(
            value = "select * from ENROLL",
            nativeQuery = true
    )
    List<EnrollEntity> findAll();

    @Query("SELECT c.cname, e.grade, e.exam " +
            "FROM ENROLL e " +
            "JOIN e.course c " +
            "WHERE e.student.sno = :sno")
    List<Object[]> findAllBySnoWithCourse(String sno);

    @Modifying
    @Transactional
    @Query(
            value = "insert into ENROLL(sno, cno, grade, exam) values (:sno, :cno, :grade, :exam)",
            nativeQuery = true
    )
    void saveOne(
            @Param("sno") String sno,
            @Param("cno") String cno,
            @Param("grade") String grade,
            @Param("exam") int exam
    );

}
