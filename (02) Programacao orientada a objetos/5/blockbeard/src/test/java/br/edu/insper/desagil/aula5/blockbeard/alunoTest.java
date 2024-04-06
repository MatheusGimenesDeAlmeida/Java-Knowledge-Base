package br.edu.insper.desagil.aula5.blockbeard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class alunoTest {
    private static final double DELTA = 0.000001;

    private Aluno a;

    @BeforeEach
    void setUp() {
        a = new Aluno(1, "João da Silva", 5.0);
    }

    @Test
    void constroi() {
        assertEquals(1, a.getId());
        assertEquals("João da Silva", a.getNome());
        assertEquals(5.0, a.getCr(), DELTA);
    }

    @Test
    void mudaCr() {
        a.setCr(7.5);
        assertEquals(7.5, a.getCr(), DELTA);
    }
}