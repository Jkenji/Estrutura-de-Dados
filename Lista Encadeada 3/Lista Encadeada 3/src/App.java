public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada list = new ListaEncadeada();

        Livro livro1 = new Livro("Fundacao", "Isaac Asimov", 1951);
        Livro livro2 = new Livro("O Fim da Infancia", " Arthur C. Clarke", 1953);
        Livro livro3 = new Livro("Neuromancer", "William Gibson", 1984);

        list.insert(livro1);
        list.insert(livro2);
        list.insert(livro3);

        System.out.println("O livro mais antigo é: " + list.getLivroMaisAntigo());

    }
}
