public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha(5);

     pilha.push(8);
     pilha.push(4);
     pilha.push(3);
     pilha.push(10);
     pilha.push(124);
     pilha.push(155);

     pilha.peek();
     pilha.pop();
     pilha.push(155);

    }
}
