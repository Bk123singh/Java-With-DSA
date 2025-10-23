import java.util.*;
public class Practice{


     public static void  Swapvalue(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The swap value of a : " + a);
        System.out.println("The swap value of b : " + b);
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float  sum(float a, float b){
        return a+b;
    }

    public static int factorial(int n){
       int a=1;

       for (int i = 0; i < n; i++) {

           a+=a*i;
       }
       return a;


    }

    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter the value of a:");
       int a=sc.nextInt();
       System.out.println("Enter the value of b:");
       int b=sc.nextInt();

        // Swapvalue(a, b);

        // System.out.println("sum: " + sum(a, b));
        // System.out.println("sum: " + sum(a, b, 10));

        // System.out.println("Flotint value : "  + sum(1.3f, 1.7f) );

        System.out.println("Factorial  of "  + "is : " + factorial(5));


        // System.out.println("Enter the operator");
    //    char oper=sc.next().charAt(0);

    //     switch(oper){
    //         case '+': System.out.println("Addition : " +  a+b );
    //         break;
    //         case '-': System.out.println("Subtract : " + ( a-b) );
    //         break;

    //         case '/': System.out.println("Division : " + (a/b));
    //         break;

    //         case '%':System.out.println("Modular: " + (a%b));
    //         break;
            
    //         case '*': System.out.println("Multiplication: " + (a*b));
    //         break;

    //         default: System.out.println("please correct operators");
          

        // }

       


        

       

    }
}