package org.araujo.comodo;

import org.araujo.paciente.Paciente;

import java.util.ArrayList;
import java.util.List;

public abstract class Comodo {

    private List<Paciente> pacientesPresentes = new ArrayList<>();

    public void addPaciente(Paciente paciente) {
        pacientesPresentes.add(paciente);
    }

    public boolean isPacientePresente(Paciente paciente) {
        return pacientesPresentes.contains(paciente);
    }
}
