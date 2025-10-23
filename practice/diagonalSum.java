public class diagonalSum {
    public static void diagonal(int arra[][]){
        int sum =0;
        for(int i=0;i<arra.length;i++){
            for(int j=0;j<arra.length;j++){
                if(i==j){
                    sum+= arra[i][j];
                    
                }
                else if (i+j==arra.length-1){
                    sum+=arra[i][j];
                }
            }
        }
        System.out.println("sum " + sum);
    }
    public static void Inc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Inc(n-1);
       
    }
    public static int  Factorial(int n){
        if(n==1){
            return 1;
        }
       int fnm1= Factorial(n-1);
       int fn = n*fnm1;
       return fn;
    }
    public static int  Fibboco(int n){
        if(n==0||n==1){
            return 1;
        }
       return Fibboco(n-1)+ Fibboco(n-2);
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);

    }
    public static int Talling(int n){
        if(n==0||n==1){
            return 1;
        }
        return Talling(n-1) + Talling(n-2);
    }
    public static void main(String[] args) {
        int arra[][]={{1,2,3,4},
                    {  5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

        System.out.println(Talling(5));
    }

}