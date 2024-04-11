public class NodeP {
    
    int data;
    NodeP prev; //Referência ao nó anterior
    NodeP next; //Referência ao nó posterior

    public NodeP(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }


}
