public class NodeG {
    
    ListaP data;
    NodeG prev; //Referência ao nó anterior
    NodeG next; //Referência ao nó posterior

    public NodeG(ListaP data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }


}
