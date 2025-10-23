import java.util.*;
public class practicelar {
    public static void largests(int number[]){
        int largest = Interer.Min_VAlUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i<number.length; i++){
        if( largest < number[i] ){
            largest = number[i];
        }
        if(smallset > number[i]){
            smallset = number[i];
        }
    }
        System.out.println("smallset number is : " + smallest);
        return largest;
    }

   public static void main(String[] args) {
    int number[] = { 3,56,4,67,100,23,2};
   System.out.println("Largest number is :" + largests(number)));
    
   }
}