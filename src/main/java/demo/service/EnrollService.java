package demo.service;

import demo.repository.EnrollRepository;
import demo.domain.EnrollEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollService {
    @Autowired
    private EnrollRepository enrollRepository;

    public List<EnrollEntity> findAll() {
        return enrollRepository.findAll();
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
