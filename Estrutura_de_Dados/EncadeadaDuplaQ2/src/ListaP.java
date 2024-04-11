public class ListaP {
    
    NodeP head; // Referência ao 1° nó da lista
    NodeP tail; // Referência ao 2° nó da lista

    public ListaP() {
        this.head = null;
        this.tail = null;
    }

    public void inserirComeço(int data){
        NodeP temp = new NodeP(data);

        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

    }

    public void inserirFim(int data){
        NodeP temp = new NodeP(data);
        if(tail == null){
            tail = temp;
            head = temp;
        } 
        else{
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
    }

    public void percorrerInicio(){
        NodeP atual = head;
        while(atual != null){
            System.out.print(atual.data + " ");
            atual = atual.next;
        }
        System.out.println();
    }

    public void percorrerFinal(){
        NodeP atual = tail;
        while (atual != null){
            System.out.print(atual.data + " ");
            atual = atual.prev;
        }
        System.out.println();
    }

    public void deletarInicio(){
        if(head == null){
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        NodeP temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }
    public void deletarFinal(){
        if(tail == null){
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        NodeP temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }
    
}
