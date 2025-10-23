public class recuraaction1{
    public static void Incnum(int n){
        if(n==1){
            System.out.println(n+ " ");
            return;
        }
        Incnum(n-1);
        System.out.println(n + " ");
        
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*fnm1;
        return fn;

    }

    public static int  fibboina(int n){
        if(n==0||n==1){
            return 1;
        }
        return fibboina(n-1) + fibboina(n-1);
    }

    public static int  power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }

    public static int Talling(int n){
        if(n==0||n==1){
            return 1;
        }
        return Talling(n-1)+Talling(n-2);
    }
    public static int Friendsheck(int n){
        if(n==0||n==1){
            return n;
        }
    //    int fnm1=Friendsheck(n-1);
    //    int fnm2= Friendsheck(n-2);
    //    int pairway = (n-1)*fnm2;
    //    int total=fnm1+pairway;
       return Friendsheck(n-1) + (n-1)*Friendsheck(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Friendsheck(3));
    }
}