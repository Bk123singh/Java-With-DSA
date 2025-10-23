import java.util.*;
public class largest{
    pulic static int getlargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i < number.length; i++){
          if(largest < number[i]){
            largest= number[i];
          }
        }
        return largest;
    }


    public static void main(String[] args) {
        int number[] = {1, 2, 4, 6, 4, 5};
        System.out.println("Largest value is "  +  getlargest(number));
    }
}
