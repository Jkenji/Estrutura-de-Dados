public class Fila {
    Node head;
    Node tail;

    public Fila() {
        this.head = null;
        this.tail = null;
    }

    public void addPaciente(Paciente paciente){
        Node temp = new Node(paciente);
        if(head == null){
            head= temp;
            tail = temp;
        } else {
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
    }

    public void visualizarFila(){
        Node current = head;
        System.out.println("Ordem da fila de atendimento:\n");
        while(current !=null){
            System.out.println("Nome do paciente: " + current.data.getNome());
            System.out.println("Idade do paciente: " + current.data.getIdade());
            System.out.println("Motivo da consulta: " + current.data.getMotivo());
            System.out.println();
            current = current.next;

           
        }
    }

    
    public Paciente remove() {
        if (head == null) {
            System.out.println("A fila está vazia");
            return null;
        } else {
            Node temp = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return temp.data;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

}


