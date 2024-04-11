public class App {
    public static void main(String[] args) throws Exception {

        ListaEncadeada months = new ListaEncadeada();

        months.insert("january");
        months.insert("february");
        months.insert("march");
        months.insert("april");
        months.insert("may");
        months.insert("june");
        months.insert("july");
        months.insert("august");
        months.insert("september");
        months.insert("october");
        months.insert("november");
        months.insert("december");

        for (int i = 0; i < 12; i++) {
            if (months.returnPosition(i).length() > 5) {
                System.out.println(months.returnPosition(i));
            }
        }
    }
}
