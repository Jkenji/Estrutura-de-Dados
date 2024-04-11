public class Paciente {
    String nome;
    int idade;
    String motivo;
    int tempoEspera;

    public Paciente(String nome, int idade, String motivo, int tempoEspera) {
        this.nome = nome;
        this.idade = idade;
        this.motivo = motivo;
        this.tempoEspera = tempoEspera;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
    
}
