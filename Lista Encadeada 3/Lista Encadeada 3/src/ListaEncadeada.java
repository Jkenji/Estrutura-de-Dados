public class ListaEncadeada {

    Node head;

    public ListaEncadeada() {
        this.head = null;
    }

    public void insert(Livro livro) {
        Node newNode = new Node(livro);
        if (head == null) {
            head = newNode;
        } else {
            Node current = newNode;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

    }

    public String getLivroMaisAntigo() {
        if (head == null) {
            return null;
        }

        Node current = head;
        Livro maisAntigo = current.livro;

        while (current != null) {
            if (current.livro.ano < maisAntigo.ano) {
                maisAntigo = current.livro;
            }

            current = current.next;

        }
        return maisAntigo.getTitulo();
    }

}
