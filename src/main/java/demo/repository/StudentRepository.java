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
