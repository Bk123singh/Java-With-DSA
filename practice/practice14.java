import java.util.*;
public class practice14 {
    public static void binarysearch(int arra[], int key){
        int  start = 0, end = arra.length - 1;
        while(start <= end){
            int mid  =  (start + end)/2;
            if(arra[mid] == key){
                System.out.println(mid);
            }
            if (arra[mid] < key){
                start = mid +1 ;
            }
            if (arra[mid] > key){
                end = mid - 1;

            }
        }
            
    
    }

    public static void main(String [] args){
        int arra[] = { 2,3,5,6,7,10,22};
        int key = 6;
        binarysearch(arra, key);
        }
    }