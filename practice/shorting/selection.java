import java.util.*;
public class selection {
    public static void selections(int number[]){
        for(int i =0; i< number.length; i++){
            for(int j = 0;j< number.length - 1 -i ;j++){
                if(number[j] > number[j+1]){
                int temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
                }
            }
        }
    }
    public static void printf(int number[]){
       for(int i = 0; i< number.length ; i++){
        System.out.println(number[i] + " ");
       }
    }


    public static void main(String [] args){
        int number[] = {4,5,3,1,2,6,8,7};
        selections(number);
        printf(number);
    }
}