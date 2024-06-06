package demo.repository;

import demo.domain.ProfessorEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, String > {
    @Override
    @Query(
            value = "select * from PROFESSOR",
            nativeQuery = true
    )
    List<ProfessorEntity> findAll();

    @Modifying
    @Transactional
    @Query(
            value = "insert into PROFESSOR(pno, pname, pmajor, pdept) values (:pno, :pname, :pmajor, :pdept)",
            nativeQuery = true
    )
    void saveOne(
            @Param("pno") String pno,
            @Param("pname") String pname,
            @Param("pmajor") String pmajor,
            @Param("pdept") String pdept
    );
}
