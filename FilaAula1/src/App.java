public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila(3);

        fila.peek();
        fila.isEmpty();
        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.peek();
        fila.remove();
        fila.peek();

    }
}
