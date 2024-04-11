public class ListaEncadeada {
    Node head;

    public void insert(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public String returnPosition(int position){
       
        Node temp = head;

        if(position == 0){
            head = temp.next;
        } 

        for(int i = 0; i<position-1; i++){
            temp = temp.next;
        }

        Node next = temp.next;
        temp.next = next;
        return temp.data;
    }
   
    

    public void deleteByKey(String key){
        Node temp = head, prev = null;
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        } 
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if (temp == null){
            return;
        }

        prev.next = temp.next;
    }

    public void deleteAtPosition(int position){
        if (head==null){
            return;
        }
        Node temp = head;

        if(position == 0){
            head = temp.next;
            return;
        } 

        for(int i = 0; temp != null && i<position-1; i++){
            temp = temp.next;
        }
        if(temp == null|| temp.next == null){
            return;
        }

        Node next = temp.next.next;
        temp.next = next;
    }
    
}
