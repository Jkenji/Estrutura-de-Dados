
public class App {
    public static void main(String[] args) throws Exception {

        Pilha par = new Pilha(10);
        Pilha impar = new Pilha(10);
        Pilha lista = new Pilha(10);

        for (int i = 0; i < 10; i++) {
            lista.push(i);
        }

        for (int i = 0; i < 10; i++) {
            if (lista.peek() % 2 == 0) {
                par.push(lista.peek());

            } else {
                impar.push(lista.peek());
            }

            lista.pop();
        }

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(par.peek());
                par.pop();
            } else {
                System.out.println(impar.peek());
                impar.pop();
            }
        }

    }
}
