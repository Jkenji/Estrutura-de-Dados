public class App {
    public static void main(String[] args) throws Exception {

        Aluno[] alunos = new Aluno[3];

        alunos[0] = new Aluno("Igor", 21, "Engenharia da Computacao");
        alunos[1] = new Aluno("Mario", 19, "Engenharia da Computacao");
        alunos[2] = new Aluno("Lens", 18, "Engenharia da Computacao");

        System.out.println("Descricao dos alunos");

        for (Aluno al : alunos) {
            al.imprimir();
        }

    }
}
