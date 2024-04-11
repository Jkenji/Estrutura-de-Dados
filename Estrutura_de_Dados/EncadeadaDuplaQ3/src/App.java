public class App {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteEncadeada listaLivros = new ListaDuplamenteEncadeada();

        listaLivros.inserir(new Livro("Kikas e Gorgos", "Mario Anijar", 2024));
        listaLivros.inserir(new Livro("Homestuck", "Andrew Hussie ", 2009));
        listaLivros.inserir(new Livro("Wings of Fire", "T. T. Sutherland", 2012));
       

        System.out.println("Livros na ordem original:");
        listaLivros.imprimirTitulos();

        listaLivros.ordenarAno();

        System.out.println("\nLivros ordenados por ano de publicação:");
        listaLivros.imprimirTitulos();
}}
