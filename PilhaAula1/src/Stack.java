public class Stack {
    Node head;
    int tamanho, quantidade;

    public Stack(int tamanho) {
        this.head = null;
        this.tamanho = tamanho;
    }

    public void push(int data) {
        Node temp = new Node(data);

        if (quantidade >= tamanho) {
            System.out.println("a pilha está cheia");
        } else {
            temp.next = head;
            head = temp;
            quantidade++;
        }

    }

    public void pop() {
        if (head == null) {
            return;
        } 
        Node temp = head;
        head = head.next;
        temp.next = null;
        quantidade--;

    }

    public void peek() {
        // Node current = head;

        if (head == null) {
            System.out.println("a pilha está vazia");
        } else {
            System.out.println(head.data);
        }
    }

    public void isEmpty() {
        if (head == null) {
            System.out.println("a lista está vazia");
        } else {
            System.out.println("a lista não está vazia");
        }
    }

    public void isFull() {
        if (tamanho == quantidade) {
            System.out.println("a pilha está cheia");
        } else {
            System.out.println("a pilha não está cheia");
        }
    }
}

/*Uma pilha é uma estrutura de dados linear na qual a 
inserção de um novo elemento e a remoção de um elemento existente ocorre na mesma
 extremidade representada como o topo da pilha .*/
