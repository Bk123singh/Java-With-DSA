import java.util.*;
public class largestinarra{
    public static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smalles number is : " + smallest);
        return largest;
    }
    public static void main(String [] args){
       
        int number [] = { 10,45,6,56,32,33,45,1,34,2,54,100};
        System.out.println("Largest number is : " + getlargest(number));

    }
}