package demo.controller;

import demo.service.StudentService;
import demo.domain.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/student/form")
    public ModelAndView FormStudent() {
        ModelAndView modelAndView = new ModelAndView("insertTestForm");
        return modelAndView;
    }

    @PostMapping(value = "/student")
    public ModelAndView InsertStudent(StudentEntity studentEntity) {
        StudentEntity savedStudentEntity = studentService.save(studentEntity);

        ModelAndView modelAndView = new ModelAndView("insertTest");
        modelAndView.addObject("student", savedStudentEntity);
        return modelAndView;
    }
}
