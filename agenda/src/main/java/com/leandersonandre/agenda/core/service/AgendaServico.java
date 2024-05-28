package com.leandersonandre.agenda.core.service;

import com.leandersonandre.agenda.core.entity.Agenda;
import com.leandersonandre.agenda.core.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaServico {
    @Autowired
    AgendaRepository agendaRepository;

    public List<Agenda> buscarData(){return agendaRepository.findAll();}
}
