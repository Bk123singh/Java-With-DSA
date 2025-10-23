
import java.util.*;
public class practice15 {
    public static void reverse(int arra[]){
        int start = 0, end  = arra.length - 1;
        while (start <=end) {
            int temp;
            temp = arra[end];
            arra[end] = arra[start];
            arra[start] = temp;
            start ++;
            end --;

            
        }
    }
    

    
public static void main(String [] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array elements:");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        for(int i = 0; i< n; i++){
        int arra[] = sc.nextInt();
        }
        reverse(arra);
        for(int i = 0; i< arra.length;i++){
            System.out.print( arra[i] + ",");
        }
    }
}