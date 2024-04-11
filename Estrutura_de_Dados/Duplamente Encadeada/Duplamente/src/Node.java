public class Node {

    int data;
    Node prev; // Referência ao nó anterior
    Node next; // Referência ao nó posterior

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}
