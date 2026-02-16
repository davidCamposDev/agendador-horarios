package com.camposdev.agendador_horarios.service;

import com.camposdev.agendador_horarios.infrastructure.entity.Agendamento;
import com.camposdev.agendador_horarios.infrastructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;
    public Agendamento SalvarAgendamento(Agendamento agendamento) {
        LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();
        LocalDateTime horafim = agendamento.getDataHoraAgendamento().plusHours(1);
    }
}
