
import com.sun.net.httpserver.Authenticator;

public class stringPrac {

    public static boolean areAnagram(String str1, String str2){
        int n1=str1.length();
        int n2=str2.length();

        if(n1!=n2){
            return false;
        }

        for(int i=0;i<n1;i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
     public static void findval(int arra[][], int key){
        int count=0;

        for(int i=0;i<arra.length;i++){
            for(int j=0;i<arra[0].length;j++){
                if(arra[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("output is: " +  count);
     }
    
    public static void main(String[] args) {
       
        String str1="race";
        String str2="care";

        int arra[][]={{4,7,8}, {8,8,7}};

        findval(arra, 7);
        // System.out.println(areAnagram(str1, str2));
        
    }
}
