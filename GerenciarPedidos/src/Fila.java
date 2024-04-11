public class Fila {
    Node head; // Referência ao 1° nó da fila
    Node tail; // Referência ao último nó da fila
    int tamanho;

    public Fila() {
        this.head = null;
        this.tail = null;
        this.tamanho = 0;
    }

    public void add(Pedido pedido) {
        Node temp = new Node(pedido);

        if (tail == null) {
            tail = temp;
            head = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        tamanho++;
    }

    public Pedido remove() {
        if (head == null) {
            System.out.println("A fila está vazia");
            return null;
        } else {
            Node temp = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            tamanho--;
            return temp.pedido;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Pedido peek() {
        if (head == null) {
            System.out.println("A fila está vazia");
            return null;
        } else {
            return head.pedido;
        }
    }

    public int size() {
        return tamanho;
    }
}
