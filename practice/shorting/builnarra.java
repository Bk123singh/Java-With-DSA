import java.util.Arrays;
public class builnarra {
    public static void printarra( int arr[]){
        for(int i=0;i< arr.lenght; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String [] args){
        int arr[] = {5, 4, 1, 3, 2};
        Array.sort(arr);
      printarra(arr);

        
    }
}