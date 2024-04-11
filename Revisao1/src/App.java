
public class App {
    public static void main(String[] args) throws Exception {

        Fila fila1 = new Fila();
        Fila fila2 = new Fila();

        fila1.add(1);
        fila1.add(2);
        fila1.add(3);

        fila2.add(1);
        fila2.add(1);
        fila2.add(2);

        filaMenorSoma(fila1, fila2);

    }

    public static void filaMenorSoma(Fila fila1, Fila fila2) throws Exception {
        if (fila1.calcularSoma() <= fila2.calcularSoma()) {
            System.out.println("A menor fila eh a fila 1");
        } else {
            System.out.println("A menor fila eh a fila 2");
        }
    }
}
