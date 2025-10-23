public class factorial {

    public static void main(String [] args){
        int n =5;
        int i=1;
        int fact=1;
        while( i <=n){
             fact = fact*i;
            i++;

        }
        System.out.println(fact);
    }
}