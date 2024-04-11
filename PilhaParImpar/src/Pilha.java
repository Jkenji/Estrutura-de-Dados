public class Pilha {

    Node head; // Referência ao 1° nó da lista
    int tamanho;
    int quantidade;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.head = null;

    }

    public int getTamanho() {
        return tamanho;
    }

    public void push(int data) {
        Node temp = new Node(data);

        if (quantidade >= tamanho) {
            System.out.println("A pilha está cheia");
        } else {
            temp.next = head;
            head = temp;
            quantidade++;
        }
    }

    public void pop() {
        if (head == null) {
            System.out.println("A pilha está vazia");
        } else {
            Node temp = head;
            head = head.next;
            System.out.println("O valor removido foi: " + temp.data);
            temp.next = null;
            quantidade--;
        }
    }

    public boolean isEmpty() {

        return head == null;
    }

    public Integer peek() {
        if (head == null) {
            System.out.println("A pilha está vazia");
            return null;
        } else {
            return head.data;
        }
    }

    public void isFull() {
        if (quantidade >= tamanho) {
            System.out.println("A pilha está cheia");
        } else {
            System.out.println("A pilha não está cheia");
        }
    }

}
