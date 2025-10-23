import java.util.*;
public class practice12 {
    public static void largestnum(int arra [] ){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i< arra.length; i++){
            if(largest < arra[i]){
                largest = arra[i];
            }
        }
        System.out.println( largest + "  is largest in this array " );
    }

    public static void main(String [] args){
        int arra[] = { 3,4,5,6,7,8};
        int key = 3;
        linearsearch(arra);

    }
}