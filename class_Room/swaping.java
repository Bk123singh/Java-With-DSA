
import java.util.Scanner;

public class swaping {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        int temp ;
        temp = a;
        a= b;
        b=temp;
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);

    }
}