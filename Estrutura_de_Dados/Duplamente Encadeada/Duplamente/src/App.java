public class App {
    public static void main(String[] args) throws Exception {

        ListaDuplamenteEncadeada list = new ListaDuplamenteEncadeada();
        list.inserirFim(1);
        list.inserirFim(2);
        list.inserirFim(3);
        list.inserirFim(4);

        list.percorrerInicio();
        list.deletarInicio();
        list.deletarFinal();
        list.percorrerInicio();
        list.percorrerFinal();
    }
}
