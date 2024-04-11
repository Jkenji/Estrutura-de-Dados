
public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();

        fila.addPaciente(new Paciente("Leandro", 18, "dor de ouvido", 5));
        fila.addPaciente(new Paciente("Igor", 21, "dor de cabeça", 5));
        fila.addPaciente(new Paciente("Mario", 19, "alergia", 5));

        int tempoTotalEspera = 0;
        while (!fila.isEmpty()) {
            Paciente pacienteAtual = fila.remove();
            System.out.println("Atendendo " + pacienteAtual.getNome() + "\nIdade: " + pacienteAtual.getIdade()
                    + "\nMotivo da consulta: " + pacienteAtual.getMotivo());
            System.out.println("Tempo estimado de atendimento: " + pacienteAtual.tempoEspera + " minutos");
            System.out.println();
            tempoTotalEspera += pacienteAtual.tempoEspera;
            try {
                Thread.sleep(pacienteAtual.tempoEspera * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(
                "Todos os pacientes foram atendidos. Tempo total de atendimento: " + tempoTotalEspera + " minutos.");

    }
}
