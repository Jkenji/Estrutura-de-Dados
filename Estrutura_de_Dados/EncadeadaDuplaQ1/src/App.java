public class App {
    public static void main(String[] args) throws Exception {
        ListaDuplamenteEncadeada months = new ListaDuplamenteEncadeada();

        months.inserirFim("January");
        months.inserirFim("February");
        months.inserirFim("March");
        months.inserirFim("April");
        months.inserirFim("May");
        months.inserirFim("June");
        months.inserirFim("July");
        months.inserirFim("August");
        months.inserirFim("September");
        months.inserirFim("October");
        months.inserirFim("November");
        months.inserirFim("December");
        months.percorrerInicio();
        months.deletarMeses();
        months.percorrerInicio();
    }
}
