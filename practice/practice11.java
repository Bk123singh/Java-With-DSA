import java.util.*;
public class practice11 {
    public static void binarysearch(int number[], int key){
        int start=0,end=number.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(number[mid]==key){
                System.out.println(mid);
            }
            if(number[mid] < key){
                start=mid+1;
            } else {
                end = mid -1;
            }

        }
        
    }

    public static void main(String [] args){
        int number[] = { 2,5,3,6,1,4};
        int key =5;
        binarysearch(number, key);

    }
}