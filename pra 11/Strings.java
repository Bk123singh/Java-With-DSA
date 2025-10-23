

public class Strings {
   public static String findlargest(String find[]){
    String largest = find[0];
    for(int i=1; i < find.length;i++){
        if(largest.compareTo(find[i])<0){
            largest=find[i];
        }

    }
    return largest;

   }

   public static boolean  palidrome(String str){
    int n=str.length();
    for(int i=0; i<str.length()/2;i++){
        if(str.charAt(i)!= str.charAt(n-i-1)){
            return false;
        }
        
    }
    return true;
   }
 public static String reverse(String str){
    StringBuilder sb=new StringBuilder("");
    
 }
    public static void main(String args[]){
        String str = "raceca";
        String find[] = {"mango", "banana" , "aople"};

        System.out.println(palidrome(str));
    }
    
}
