public class App {
    public static void main(String[] args) throws Exception {
    
        int[] arr = {3, 2, 4, 5, 1, 0, 6*5, 8, 7};

        SelectionSort ss = new SelectionSort();

        ss.SelectionSort(arr);

        System.out.println("Valor Ordenado: ");
        ss.print(arr);
    }
    
}
