package com.leandersonandre.agenda.controllers;

import com.leandersonandre.agenda.core.service.ProfessorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorServico professorServico;

    @GetMapping
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("professor/index.html");
        view.addObject("objeto","olá thymeleaf");
        view.addObject("professores",professorServico.obterTodos());
        return view;
    }

}
