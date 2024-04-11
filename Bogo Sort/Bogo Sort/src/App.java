public class App {
    public static void main(String[] args) throws Exception {
      
        int[] ar_bog = {3, 2, 4, 5, 1, 0};

        BogoSort ob = new BogoSort();

        ob.BogoSort(ar_bog);

        System.out.println("Valor Ordenado: ");
        ob.print(ar_bog);
    }
}
