public class App {
    public static void main(String[] args) throws Exception {
        
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        //arr[2] = 30;
        arr[3] = 34;
        arr[4] = 47;

        for(int i = 0; i < arr.length; i++){
        System.out.println("Elemento na posição "+ i +": "+arr[i]);
    }

    }
}
