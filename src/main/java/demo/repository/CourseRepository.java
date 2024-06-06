package demo.repository;

import demo.domain.CourseEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends JpaRepository<CourseEntity, String > {
    @Override
    @Query(
            value = "select * from COURSE",
            nativeQuery = true
    )
    List<CourseEntity> findAll();

    @Modifying
    @Transactional
    @Query(
            value = "insert into COURSE(cno, cname, credit, sessions) values (:cno, :cname, :credit, :sessions)",
            nativeQuery = true
    )
    void saveOne(
            @Param("cno") String cno,
            @Param("cname") String cname,
            @Param("credit") String credit,
            @Param("sessions") String sessions
    );
}
