import java.util.*;
public class practice4 {
    public static void linersearch(int number[] , int key){
        int i;
        for(i=1; i<number.length; i++){
            if(number[i] == key){
                System.out.println("Value of key:"  + index);
            }

        }
       System.out.println("Not found");
    }


    public static void main(String[] args) {
        int number[]= {35,45,30.12,3,5,8,9 };
        int key = 5; 
        int index = linersearch(number,key);
       System.out.println(index);
        
    }
}