public class App {
    public static void main(String[] args) throws Exception {
        
        BubbleSort bub = new BubbleSort();

        int[] arr = {3, 2, 4, 5, 1, 0, 6, 8, 7};

       // int n = arr.length;
        
        bub.BubbleSort(arr, arr.length);
        System.out.println("Vetor Ordenado: ");
        bub.print(arr, arr.length);
    }
}
