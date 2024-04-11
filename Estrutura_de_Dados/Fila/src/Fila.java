public class Fila {
    
         
    Node head; // Referência ao 1° nó da lista
    Node tail; // Referência ao 2° nó da lista
    int tamanho;
    
    
        public Fila() {
            this.head = null;
            this.tamanho = 0;
        }

     


        public void add(int data) {
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
           tamanho++;
          
        }

        public void remove(){
            if(head == null){
                System.out.println("A Fila está vazia");
            }
            else{
                if(head == null){
                    return;
                }
        
                if (head == tail){
                    head = null;
                    tail = null;
                    return;
                }
        
                Node temp = head;
                System.out.println("O valor removido foi: "+ head.data);
                head = head.next;
                head.prev = null;
                temp.next = null;
                tamanho--;
        }
        }

        public void isEmpty(){
          if (head == null){
            System.out.println("A lista está vazia");
          }
          else{
            System.out.println("A lista não está vazia");
          }
         }


        public void peek(){
            if(head == null){
                System.out.println("A pilha está vazia");
            }
            else{
                System.out.println("O valor do topo é: " + head.data);
            }
         }

         public void size(){
            System.out.println("O tamanho da Fila é: " + tamanho);
         }

    }
    

