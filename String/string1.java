import java.util.*;
public class string1 {
//lexicographic 
    public static void main(String [] args){
      String  fruits[] =  { "apple" , "mango" , "banana"};
        String largest = fruits[0];
        for(int i=1; i < fruits.lentgth ; i++){
            if(largest.compareTo(fruits[i]) <0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);

    }
}