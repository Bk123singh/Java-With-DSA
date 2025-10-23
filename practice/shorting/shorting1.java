import java.util.*;
public class shorting1 {
    public static void bubble(int arr[]){
        for(int trun =0 ;trun < arr.length -1-trun; trun++){
            for(int j=0;j <arr.length;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }
    public static void printarra( int arr[]){
        for(i=0;i< arr.lenght; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String [] args){
        int arra[] = {5, 4, 2, 3, 1};
        bubble(arra);
        printarra(arra);
        
        
    }
}