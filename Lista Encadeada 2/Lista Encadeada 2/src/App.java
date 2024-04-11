public class App {
    public static void main(String[] args) throws Exception {

        BigListaEncadeada bigList = new BigListaEncadeada();

        ListaEncadeada list1 = new ListaEncadeada();
        ListaEncadeada list2 = new ListaEncadeada();
        ListaEncadeada list3 = new ListaEncadeada();
        ListaEncadeada list4 = new ListaEncadeada();

        for (int i = 1; i <= 4; i++) {
            list1.insert(i);
            list2.insert(i + 4);
            list3.insert(i + 8);
            list4.insert(i + 12);
        }

        bigList.insert(list1);
        bigList.insert(list2);
        bigList.insert(list3);
        bigList.insert(list4);

        bigList.bigPrintList();

        int soma = bigList.somaTotal();
        System.out.println("A soma total de todos os elementos da matriz é: " + soma);
    }
}
