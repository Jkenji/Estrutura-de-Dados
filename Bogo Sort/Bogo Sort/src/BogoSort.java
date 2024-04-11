public class BogoSort {
    
    public void BogoSort(int[] a){//fica chamando varias e varias vezes o shuffle
        while(isSorted(a) == false){
          shuffle(a);
        }
    }

    public void shuffle(int[] a){
        for(int i = 1; i < a.length; i++){
            swap(a, i, (int)(Math.random() * i));
        }
    }
    
    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public boolean isSorted(int[] a){
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[i - 1]){
                return false;
            }
        }

        return true;
    }

    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    
}