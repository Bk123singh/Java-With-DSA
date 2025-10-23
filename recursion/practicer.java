public class practicer {
    public static int  Friend(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = Friend(n-1);
        int fnm2 = Friend(n-2);
        int totalway = fnm1+ (n-1)*fnm2;
        return totalway;
    }
    

    public static void main(String[] args) {
    System.out.println(Friend(4));
        
    }
}