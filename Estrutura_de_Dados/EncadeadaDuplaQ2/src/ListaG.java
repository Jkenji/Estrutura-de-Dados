public class ListaG {
    
    NodeG head; // Referência ao 1° nó da lista
    NodeG tail; // Referência ao 2° nó da lista

    public ListaG() {
        this.head = null;
        this.tail = null;
    }

    public void inserirComeço(ListaP data){
        NodeG temp = new NodeG(data);

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

    public void inserirFim(ListaP data){
        NodeG temp = new NodeG(data);
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
        NodeG atual = head;
        while(atual != null){
            System.out.println(atual.data + "");
            atual = atual.next;
        }
        System.out.println();
    }

    public void percorrerFinal(){
        NodeG atual = tail;
        while (atual != null){
            System.out.println(atual.data + "");
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

        NodeG temp = head;
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

        NodeG temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
    }

    public void somaLinha(){
        System.out.println();
        System.out.println("Soma da primeira linha:");
        int soma = 0;
        NodeG atual = head;
        while(atual != null && atual.data.head!= null){
            soma += atual.data.head.data;
            atual.data.head = atual.data.head.next;
        }
        System.out.println("Soma: " + soma);
        System.out.println();  
    }
    public void somaMatriz(){

        System.out.println("Soma da matriz:");
        int soma = 0;
        NodeG atual = head;
        while(atual != null){
        while(atual.data.tail!= null){
            soma += atual.data.tail.data;
            atual.data.tail = atual.data.tail.prev;
            
        }
        atual = atual.next;}
        System.out.println("Soma: " + soma);
    }
    
}
