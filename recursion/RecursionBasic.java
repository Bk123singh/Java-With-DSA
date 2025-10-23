public class RecursionBasic {
    public static void basic(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        basic(n-1);

    }

    // increassing oder

    public static void printInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    //factorial of a number:{
    // public static int fact (int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     int fnm1 = fact(n-1);
    //     int fn = n*fact(n-1);
    //     System.out.println(fn);
    // }
    //sum of n natural number
public static int sumOf(int n){
    if(n==0){
        return 0;
    }
    int su = sumOf(n-1);
    int sum = sumOf(n-1) + n;
    return sum;
}

//fibonacci number;

public static int fibo(int n){
    if(n==0 || n==1){
        return n;
        
    }
    int fnm1 = fibo(n-1);
    int fnm2 = fibo(n-2);
    int fn = fnm1 + fnm2;
    return fn;
}

    public static void main(String[] args) {
        int n= 25;
        System.out.println(fibo(n));
        

    }
}