// friends pairain priblem 
//Q) Given n firends each can remain simgle or can be paired up with oter firend.
// Each friend can be paired only once. Find out the total numver of ways in which 
//friends can remain single or can be paired up ?
public class FriendsPairing {
    public static int FriendPair(int n){
        if(n==0|| n==1){
            return n;
        }
        // choice
        // single
        // int fnm1= FriendPair(n-1);
        
        // pair
        // int fnm2 = FriendPair(n-2);
        // int pairWay = (n-1)*fnm2;

        // totalways
        // int totalWay = fnm1 + pairWay;
        return FriendPair(n-1) + (n-1)*FriendPair(n-2);
    }

    // problem no. 14
    // Q) binary 

    public static void main(String[] args) {
        System.out.println(FriendPair(4));
    }
}
  