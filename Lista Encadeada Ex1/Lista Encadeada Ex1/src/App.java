public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada list = new ListaEncadeada();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        // list.insert(3);

        System.out.println("Lista Inicial:");
        list.printList();

        list.deleteByKey(3);

        System.out.println("Lista após remover o elemento 3:");
        list.printList();

        list.deleteByPosition(0);

        System.out.println("Lista após remover o nó da posição 2:");
        list.printList();

    }
}