public class InsertionSort{
    public static void main(String[] args){
        int a[] = {8,5,4,7,6};
        int k;
        int temp;

        for(int i = 1; i < a.length-1; i++){
            k = a[i];
            for(int j = i-1 ; j >= 0; j--){
                if(k < a[j]){
                    temp = a[j];    // temp = 8
                    a[j] = k;       // a[j] = 5
                    k = temp;       // k = 8
                }
                a[j+1] = k;
            }
        }
    
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}