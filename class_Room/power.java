
import java.util.Scanner;

public class power {
    public static  void powers(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum += Math.pow(i, i);
        }
        System.out.println("The number of series sum =  " + sum);

    }
    public static void powe(int n){
       double sum=0.0;
       for(int i =1; i<=n; i++){
        sum+=1.0/Math.pow(i, i);
       }
       System.out.println("sum : " + sum );
        }
        public static int fact(int n){
            int fac= 1;
            for(int i=0; i<n;i++){
                fac=fac*i;
            }
            return fac;
        }

    public static void  factorial(int n){
         double sum=0;
         for(int i= 1; i<n ; i++){
            sum += fact(n);
         }
         System.out.println(sum);
        }

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number"); 
        int n = sc.nextInt();
        factorial(n);
    }
}