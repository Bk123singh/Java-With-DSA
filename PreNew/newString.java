
import java.util.Stack;

public class newString{

    public static String Nmerge(String str1 , String str2){
        StringBuilder sb=new  StringBuilder("");
        int i=0;
        while(i<str1.length() || i< str2.length()){

            if(i<str1.length()){
                sb.append(str1.charAt(i));
            }

            if(i< str2.length()){
                sb.append(str2.charAt(i));
            }
            i++;

        }
        return sb.toString();
    }

    public static int inserPosition(int arra[],int target){

        int lp=0;
        while(lp<arra.length){
            if(arra[lp] > target){
                return lp;
            }
        }

        return -1;

    
    }

    public static void find(int arra[], int target){
        boolean ans[]=new boolean[arra.length];
        int largest=0;
        for(int i=0;i<arra.length;i++){
            largest=Math.max(largest, arra[i]);
        }

        for(int i=0;i<arra.length;i++){
            if(arra[i]+target >= largest){
                ans[i]=true;
            }else{
                ans[i]=false;
            }
        }

    for(int i=0;i<ans.length;i++){
        System.out.print(ans[i] + " ");
    }

    }

    public static void ReverseWord(String str){
        Stack<String> s= new Stack<>();
        StringBuilder sb=new StringBuilder();

        
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            
            
        }


    }

    public static  String reverseWords(String s) {
        
        String str[]=s.trim().split("//+");

        String out=" ";

        for(int i=str.length-1;i>0;i--){
            out += str[i] + " ";
        }
        return out + str[0];
    }

    public static void main(String args[]){
        // String str1="ab";
        // String str2="pqrs";
        // System.out.println(Nmerge(str1,str2));

        // int arra[]={1,3,5,6};
        // System.out.println(inserPosition(arra, 7));
        int arra[]={12,1,12};

    //   find(arra, 10);

    String s=" blue is sky the";

    System.out.println(reverseWords(s));

        


        

    }
}