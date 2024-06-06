package demo.service;

import demo.repository.LectureRepository;
import demo.domain.LectureEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {
    @Autowired
    private LectureRepository lectureRepository;

    public List<LectureEntity> findAll() {
        return lectureRepository.findAll();
    }

    public LectureEntity save(LectureEntity lectureEntity) {
        lectureRepository.saveOne(
                lectureEntity.getCno(),
                lectureEntity.getPno(),
                lectureEntity.getLec_time(),
                lectureEntity.getRoom()
        );
        return lectureEntity;
    }
}
