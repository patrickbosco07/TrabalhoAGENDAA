package com.leandersonandre.agenda.core.service;

import com.leandersonandre.agenda.core.entity.Professor;
import com.leandersonandre.agenda.core.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServico {

    @Autowired
    ProfessorRepository professorRepository;

    public List<Professor> obterTodos() {
        return professorRepository.findAll();
    }

}
