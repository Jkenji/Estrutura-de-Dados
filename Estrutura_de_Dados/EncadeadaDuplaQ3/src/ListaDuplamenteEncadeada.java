public class ListaDuplamenteEncadeada {
    
    Node head; // Referência ao 1° nó da lista
    Node tail; // Referência ao 2° nó da lista

    public ListaDuplamenteEncadeada() {
        this.head = null;
        this.tail = null;
    }

    public void inserir(Livro data){
        Node temp = new Node(data);
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

    public void ordenarAno() {
        if (head == null)
            return;

        Node atual = head;
        while (atual != null) {
            Node proximo = atual.next;
            while (proximo != null) {
                if (atual.data.getAnoPublicacao() > proximo.data.getAnoPublicacao()) {
                    Livro temp = atual.data;
                    atual.data = proximo.data;
                    proximo.data = temp;
                }
                proximo = proximo.next;
            }
            atual = atual.next;
        }
    }

    public void imprimirTitulos() {
        Node atual = head;
        while (atual != null) {
            System.out.println(atual.data.getTitulo());
            atual = atual.next;
        }
    }
    
    
}
