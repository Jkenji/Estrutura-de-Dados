public class Node {
    
    String data;
    Node prev; //Referência ao nó anterior
    Node next; //Referência ao nó posterior

    public Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }


}
