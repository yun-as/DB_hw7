package demo.controller;

import demo.domain.*;
import demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class CommonController {
    @Autowired
    StudentService studentService;
    ProfessorService professorService;
    CourseService courseService;
    EnrollService enrollService;
    LectureService lectureService;

    public CommonController(
            StudentService studentService,
            ProfessorService professorService,
            CourseService courseService,
            EnrollService enrollService,
            LectureService lectureService
    ) {
        this.studentService = studentService;
        this.professorService = professorService;
        this.courseService = courseService;
        this.enrollService = enrollService;
        this.lectureService = lectureService;
    }

    @GetMapping(value = "/1-a")
    public ModelAndView firstA() {
        ModelAndView modelAndView = new ModelAndView("1-a");

        // student 데이터 확인 & tuple 총 갯수 출력
        List<StudentEntity> students = studentService.findAll();
        modelAndView.addObject("students", students);
        modelAndView.addObject("studentCount", students.size());

        // professor 데이터 확인 & tuple 총 갯수 출력
        List<ProfessorEntity> professors = professorService.findAll();
        modelAndView.addObject("professors", professors);
        modelAndView.addObject("professorCount", professors.size());

        // course 데이터 확인 & tuple 총 갯수 출력
        List<CourseEntity> courses = courseService.findAll();
        modelAndView.addObject("courses", courses);
        modelAndView.addObject("courseCount", courses.size());

        // enroll 데이터 확인 & tuple 총 갯수 출력
        List<EnrollEntity> enrolls = enrollService.findAll();
        modelAndView.addObject("enrolls", enrolls);
        modelAndView.addObject("enrollCount", enrolls.size());

        // lecture 데이터 확인 & tuple 총 갯수 출력
        List<LectureEntity> lectures = lectureService.findAll();
        modelAndView.addObject("lectures", lectures);
        modelAndView.addObject("lectureCount", lectures.size());
        return modelAndView;
    }

    @GetMapping(value = "/1-b")
    public ModelAndView firstB() {
        ModelAndView modelAndView = new ModelAndView("1-b");

        List<StudentEntity> students = studentService.findAll();
        modelAndView.addObject("students", students);
        modelAndView.addObject("studentCount", students.size());

        return modelAndView;
    }

    @GetMapping(value = "/1-b/{sno}")
    public ModelAndView getStudentBySno(@PathVariable("sno") String sno) {
        ModelAndView modelAndView = new ModelAndView("1-b-show");

        Optional<StudentEntity> optionalStudent = studentService.findBySno(sno);
        modelAndView.addObject("student", optionalStudent.get());



        return modelAndView;
    }
}

