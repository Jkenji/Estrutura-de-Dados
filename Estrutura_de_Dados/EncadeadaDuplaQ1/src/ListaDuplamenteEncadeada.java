public class ListaDuplamenteEncadeada {

    Node head; // Referência ao 1° nó da lista
    Node tail; // Referência ao 2° nó da lista

    public ListaDuplamenteEncadeada() {
        this.head = null;
        this.tail = null;
    }

    public void inserirComeço(String data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

    }

    public void inserirFim(String data) {
        Node temp = new Node(data);
        if (tail == null) {
            tail = temp;
            head = temp;
        } else {
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
    }

    public void percorrerInicio() {
        Node atual = head;
        while (atual != null) {
            System.out.println(atual.data + "");
            atual = atual.next;
        }
        System.out.println();
    }

    public void percorrerFinal() {
        Node atual = tail;
        while (atual != null) {
            System.out.println(atual.data + "");
            atual = atual.prev;
        }
        System.out.println();
    }

    public void deletarInicio() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }

    public void deletarFinal() {
        if (tail == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }

    public void deletarMeses() {
        Node atual = head;
        while (atual != null) {
            if (atual.data.length() <= 5) {
                if (atual == head && atual == tail) {
                    head = null;
                    tail = null;
                } else if (atual == head) {
                    head = head.next;
                    head.prev = null;
                } else if (atual == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    atual.prev.next = atual.next;
                    atual.next.prev = atual.prev;
                }
            }
            atual = atual.next;
        }
    }

}
