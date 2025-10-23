import java.util.*;
public class reverse{
    public static void reverse( int number[]){
        int first =0, last = number.length-1;
        while( first < last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = number[temp];

            first ++ ;
            last -- ;
        }

 
    }

    public static void main(String [] args){

        int number[] = { 2,3,4,5,6,7,8};
        reverse(number);
       for( int i=1;i < number.length ; i++){
        System.out.println(number[i] + " ");
       }
       System.out.println();

    }
}