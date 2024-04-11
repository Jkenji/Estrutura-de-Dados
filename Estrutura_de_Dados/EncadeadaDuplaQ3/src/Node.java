public class Node {
    
    Livro data;
    Node prev; //Referência ao nó anterior
    Node next; //Referência ao nó posterior

    public Node(Livro data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }


}
