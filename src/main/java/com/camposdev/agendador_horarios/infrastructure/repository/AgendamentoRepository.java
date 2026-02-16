package com.camposdev.agendador_horarios.infrastructure.repository;

import com.camposdev.agendador_horarios.infrastructure.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
