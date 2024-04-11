public class App {
    public static void main(String[] args) throws Exception {
        String[] months = { "january", "february", "march", "april", "may", "june", "july", "august", "september",
                "october", "november", "december" };

        System.out.println("Os meses do ano em ingles com mais de 5 letras sao: ");

        for (String mes : months) {
            if (mes.length() > 5) {
                System.out.println(mes);
            }
        }
    }
}
