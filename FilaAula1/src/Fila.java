public class Fila {
    Node head;
    Node tail;
    int tamanho;

    public Fila(int tamanho) {
        this.head = null;
        this.tamanho = 0;
    }

    public void add(int data) {
        Node temp = new Node(data);

        if (tail == null) {
            tail = temp;
            head = temp;

        } else {
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }

        tamanho++;
    }

    public void remove() {
        if (head == null) {
            System.out.println("vazio");
        } else {
            if (head == null) {
                return;
            }

            if (head == tail) {
                head = null;
                tail = null;
                return;
            }

            Node temp = head;
            System.out.println("o valor removido foi: " + head.data);
            head = head.next;
            head.prev = null;
            temp.next = null;
            tamanho--;
        }

    }

    public void peek() {
        // Node current = head;

        if (head == null) {
            System.out.println("vazio");
        } else {
            System.out.println(head.data);
        }
    }

    public void isEmpty() {
        if (head == null) {
            System.out.println("vazio");
        } else {
            System.out.println("tem espaço");
        }
    }

    public void size() {
        System.out.println("tamanho eh: " + tamanho);
    }
}
