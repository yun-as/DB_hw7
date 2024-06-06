package demo.repository;

import demo.domain.StudentEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<StudentEntity, String> {
    @Override
    @Query(
            value = "SELECT * FROM STUDENT",
            nativeQuery = true
    )
    List<StudentEntity> findAll();

    @Query(
            value = "SELECT * FROM STUDENT WHERE sno = :sno",
            nativeQuery = true
    )
    Optional<StudentEntity> findBySno(String sno);

    @Query(
            value = "SELECT sname, s.sno, e.cno, grade, exam " +
                    "FROM ENROLL e " +
                    "JOIN STUDENT s ON e.sno = s.sno " +
                    "WHERE (e.exam < 60 OR (e.exam >= 60 AND e.exam <= 69) OR (e.exam >= 70 AND e.exam <= 79) OR (e.exam >= 80 AND e.exam <= 89) OR (e.exam >= 90)) AND (" +
                    "   (e.exam < 60 AND e.grade <> 'F') OR " +
                    "   (e.exam >= 60 AND e.exam <= 69 AND e.grade <> 'D') OR " +
                    "   (e.exam >= 70 AND e.exam <= 79 AND e.grade <> 'C') OR " +
                    "   (e.exam >= 80 AND e.exam <= 89 AND e.grade <> 'B') OR " +
                    "   (e.exam >= 90 AND e.grade <> 'A')" +
                    ")",
            nativeQuery = true
    )
    List<Object[]> wrongStudent();


    @Modifying
    @Transactional
    @Query(
            value = "INSERT INTO STUDENT(sno, pno, sname, year, dept) VALUES (:sno, :pno, :sname, :year, :dept)",
            nativeQuery = true
    )
    void saveOne(
            @Param("sno") String sno,
            @Param("pno") String pno,
            @Param("sname") String sname,
            @Param("year") String year,
            @Param("dept") String dept
            );

}
