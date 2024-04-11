public class BigListaEncadeada {
    BigNode head;

    public void insert(ListaEncadeada data) {
        BigNode newNode = new BigNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void bigPrintList() {
        BigNode current = head;
        while (current != null) {
            for (int i = 1; i <= current.data.size(); i++) {
                System.out.println(current.data.index(i) + " ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public int somaTotal() {
        int soma = 0;
        BigNode current = head;
        while (current != null) {
            ListaEncadeada currentList = current.data;
            Node temp = currentList.head;
            while (temp != null) {
                soma += temp.data;
                temp = temp.next;
            }
            current = current.next;
        }
        return soma;
    }

    public int size() {
        BigNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    public void deleteByKey(ListaEncadeada key) {
        BigNode temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            return;
        }

        BigNode temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }

    }

    public ListaEncadeada index(int position) {
        BigNode temp = head;
        if (position == 0) {
            head = temp.next;
        }

        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        BigNode next = temp.next;
        temp.next = next;
        return temp.data;

    }
}