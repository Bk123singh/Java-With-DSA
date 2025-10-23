import java.util.*;
public class function2 {

    public static void sum(int a, int b){
        int sum = a+b;
        System.out.println("result  " + sum);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a And b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
    }
}