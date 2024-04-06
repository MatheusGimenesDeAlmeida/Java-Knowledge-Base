package br.edu.insper.desagil.aula5.blockbeard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class matriculaTest {
    private Matricula m;

    @BeforeEach
    void setUp() {
        Aluno aluno = new Aluno(1, "João da Silva", 5.0);
        m = new Matricula(aluno);
    }

    @Test
    void constroi() {
        assertNotNull(m.getAluno()); // Verifica se essa matricula existe
        assertFalse(m.isTrancada()); // Verifica se essa matrícula não está trancada
    }

    @Test
    void mudaTrancada() {
        m.setTrancada(true); // Modifica o estado da matícula
        assertTrue(m.isTrancada()); // Verifica se o estado foi alterado
    }
}