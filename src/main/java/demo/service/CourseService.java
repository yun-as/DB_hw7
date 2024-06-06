package demo.service;

import demo.repository.CourseRepository;
import demo.domain.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<CourseEntity> findAll() {
        return courseRepository.findAll();
    }

    public CourseEntity save(CourseEntity courseEntity) {
        courseRepository.saveOne(
                courseEntity.getCno(),
                courseEntity.getCname(),
                courseEntity.getCredit(),
                courseEntity.getSessions()
        );
        return courseEntity;
    }
}
