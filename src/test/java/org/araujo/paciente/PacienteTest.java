package org.araujo.paciente;

import org.araujo.comodo.Banheiro;
import org.araujo.comodo.Cozinha;
import org.araujo.comodo.Quarto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteTest {

    @Test
    void deveRetornarPresencaBanheiro() {
        Paciente paciente = new Paciente("João", "M");
        Banheiro.getInstancia().addPaciente(paciente);

        assertEquals("Banheiro", paciente.getLocalizacao());
    }

    @Test
    void deveRetornarPresencaCozinha() {
        Paciente paciente = new Paciente("João", "M");
        Cozinha.getInstancia().addPaciente(paciente);

        assertEquals("Cozinha", paciente.getLocalizacao());
    }

    @Test
    void deveRetornarPresencaQuarto() {
        Paciente paciente = new Paciente("João", "M");
        Quarto.getInstancia().addPaciente(paciente);

        assertEquals("Quarto", paciente.getLocalizacao());
    }

    @Test
    void deveRetornarPresencaNaoEncontrado() {
        Paciente paciente = new Paciente("João", "M");

        assertEquals("Não encontrado!", paciente.getLocalizacao());
    }

}