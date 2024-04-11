public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha(10);

        pilha.push(3);
        pilha.push(-5);
        pilha.push(7);
        pilha.push(-2);
        pilha.push(9);
        pilha.push(-4);

        System.out.println("Soma dos elementos positivos: " + pilha.somaPositivos());
        System.out.println("Soma dos elementos negativos: " + pilha.somaNegativos());
    }
}
