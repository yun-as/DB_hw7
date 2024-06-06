package demo.service;

import demo.domain.StudentEntity;
import demo.repository.EnrollRepository;
import demo.domain.EnrollEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollService {
    @Autowired
    private EnrollRepository enrollRepository;

    public List<EnrollEntity> findAll() {
        return enrollRepository.findAll();
    }

    public List<Object[]> findAllBySnoWithCourse(String sno) {
        return enrollRepository.findAllBySnoWithCourse(sno);
    }

    public EnrollEntity save(EnrollEntity enrollEntity) {
        enrollRepository.saveOne(
                enrollEntity.getSno(),
                enrollEntity.getCno(),
                enrollEntity.getGrade(),
                enrollEntity.getExam()
        );
        return enrollEntity;
    }
}
