import java.util.*;
public class practice{
    public static void add( int a , int b){
        int sum;
        sum =  a + b;
        System.out.println("Result = "  +  sum);

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        add( a , b);
     

    }

}
