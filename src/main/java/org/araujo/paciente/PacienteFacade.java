package org.araujo.paciente;

import org.araujo.comodo.Banheiro;
import org.araujo.comodo.Cozinha;
import org.araujo.comodo.Quarto;

public class PacienteFacade {

    public static String encontrarPaciente(Paciente paciente) {
        if (Quarto.getInstancia().isPacientePresente(paciente)) {
            return "Quarto";
        } if (Cozinha.getInstancia().isPacientePresente(paciente)) {
            return "Cozinha";
        } if (Banheiro.getInstancia().isPacientePresente(paciente)) {
            return "Banheiro";
        }
        return "Não encontrado!";
    }
}
