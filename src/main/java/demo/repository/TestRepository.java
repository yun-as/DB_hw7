package demo.repository;

import demo.domain.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface TestRepository extends JpaRepository<TestEntity, Integer> {
    }

