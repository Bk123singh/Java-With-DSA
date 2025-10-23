public class practice1121 {
    public static void sumint(int n){
        if(n==1){
           System.out.println(n + " ");
           return;
        }
    sumint(n-1);
        System.out.println(n + " ");
    }

    public static void Printdec(int n){
        if(n==1){
            System.out.println(n + " ");
            return;
        }
        System.out.println(n + " ");
        Printdec(n-1);
    }
    public static int factor(int n ){
        if(n==0){
            return 1;
        }
        factor(n-1);
        int fn1 = factor(n-1);
        int fn = factor(n-1)*n;
        System.out.println("factorial of "  +  n + " is : ");
    }
    // /factorial of a number:{
        public static int factorial(int n){
            if(n==0){
                return 1;
            }
            int fnm1 = factorial(n-1);
            int fn = n*factorial(n-1);
            System.out.println(fn);
        }

    public static void main(String[] args) {

        sumint(10);
        Printdec(10);
        
    }
}