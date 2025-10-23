import java.util.*;
public class pairs {
    public static void printPairs(int numbere[]){
        tp = 0;
        for(int i= 0; i < number.length ; i++){
            curr= number[i];
            for(int j = i+1; j < number.length; j++){
                System.out.println("(" + curr + "," + number[j] + ")");
                tp ++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }

    public static void main(String [] args){
        int number[]= {2,4,6,8};
        printPairs(number);
    }
}