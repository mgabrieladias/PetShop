package pacote4;

import java.util.ArrayList;

import java.util.List;

public class Agenda {
    private List<Agendamento> agendamentos;

    public Agenda() {
        agendamentos = new ArrayList<>();
    }

    public boolean agendar(Agendamento novoAgendamento) {
        // Verifica se o horário já está ocupado
        for (Agendamento agendamento : agendamentos) {
            if (agendamento.getData().equals(novoAgendamento.getData()) &&
                agendamento.getHorario().equals(novoAgendamento.getHorario())) {
                System.out.println("Horário já ocupado. Agendamento não realizado.");
                return false;
            }
        }

        // Adiciona o novo agendamento à lista
        agendamentos.add(novoAgendamento);
        System.out.println("Agendamento realizado com sucesso.");
        return true;
    }

}