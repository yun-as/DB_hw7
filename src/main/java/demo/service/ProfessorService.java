package demo.service;

import demo.repository.ProfessorRepository;
import demo.domain.ProfessorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public List<ProfessorEntity> findAll() {
        return professorRepository.findAll();
    }

    public ProfessorEntity save(ProfessorEntity professorEntity) {
        professorRepository.saveOne(
                professorEntity.getPno(),
                professorEntity.getPname(),
                professorEntity.getPmajor(),
                professorEntity.getPdept()
        );
        return professorEntity;
    }
}
