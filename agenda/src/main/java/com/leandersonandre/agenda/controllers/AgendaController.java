package com.leandersonandre.agenda.controllers;

import com.leandersonandre.agenda.core.service.AgendaServico;
import com.leandersonandre.agenda.core.service.ProfessorServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    AgendaServico agendaServico;

    @GetMapping
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("agenda/index.html");
        view.addObject("objeto","olá thymeleaf");
        view.addObject("agendas",agendaServico.buscarData());
        return view;
    }
}
