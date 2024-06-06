package demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProfessorController {
    @GetMapping(value = "/a")
    public ModelAndView asdf() {
        ModelAndView modelAndView = new ModelAndView("asdf");
        return modelAndView;
    }
}
