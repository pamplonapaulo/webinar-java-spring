package com.paulopamplona.twgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulopamplona.twgerenciadortarefas.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {
    
}