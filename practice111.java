public  class practice111 {
    public static void factorial(int n){
        int fact = 1;
        for(int i= 1; i<=n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
        
    }
    public static void prime(int n){
        
    }

    public static void main(String[] args) {
        int a=2;
        int b=3;
        //usinng 3 variable 
        // int temp;
        // temp = a;
        // a=b;
        // b=temp;
        //using two variable
        // a = a + b;
        // b=a-b;
        // a=a-b;

        //without additionn and sustraction
        // a= a ^ b;
        // b= a ^ b;
        // a= a ^ b;
        // System.out.println(a);
        // System.out.println(b);
        factorial(5);
    }
}