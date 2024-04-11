public class Pilha {
    Node head;
    int quantidade;

    public Pilha() {
        this.head = null;
    }

    public void push(Pagina data) {
        Node temp = new Node(data);

        temp.next = head;
        head = temp;
        quantidade++;

    }

    public void pop() {
        if (head == null) {
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        quantidade--;
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
}
