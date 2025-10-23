public class problem {
    public static int  power(int x, int n){
        if(n==0){
            return 1;
        }
    //    int xnm1= power(x, n-1);
    //    int xn =x*xnm1;
    //    return xn; 
        return x*power(x, n-1);

    } 
    public static void printInc(int n){
        if(n==1){
            System.out.println(n + " ");
            return;
        }
        
        System.out.println(n + " ");
        printInc(n-1);
    }
    public static int  inter(int n){
        if(n==0){
            return 1;
        }
        int fnm1= inter(n-1);
        int fn= n*fnm1;
        return fn;
    }
    public static  int powerS(int x, int n){
    if(n==0){
        return 1;
    }
    return  x*powerS(x, n-1);
}
public static int optimize(int a, int n){  // O(log(n))
    if(n==0){
        return 1;
    }
    int helfPower=optimize(a, n/2);
    int helfPowersq = helfPower*helfPower;
     //n is odd
     if(n%2!=0){
        helfPowersq = a*helfPowersq;

     }
     return helfPowersq;
}
    public static void main(String[] args) {
        
        System.out.println(optimize(2, 5));
        
    }
}