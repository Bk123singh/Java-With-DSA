import java.util.*;
public class swap {
    public static void swap(int a, int b){
        tem=a;
        a=b;
        b=tem;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void swap1(){
        int a=20;
        int b=40;
        int tem;
        tem =a;
        a=b;
        b=tem;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap1();
        
    }
}