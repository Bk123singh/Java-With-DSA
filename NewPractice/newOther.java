

public class newOther {

    public static boolean  Pallidrom(String str){

        int n=str.length();
        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }

    public static String upperCase(String str1){

        StringBuilder sb=new StringBuilder(" ");


        char ch=Character.toUpperCase(str1.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str1.length(); i++) {
            if(str1.charAt(i)==' ' && i<str1.length()-1){

                sb.append(str1.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str1.charAt(i)));

            } else{
                sb.append(str1.charAt(i));
            }
        }
        return sb.toString();
    }

    // public static String compress(String str){

    //     StringBuilder sb=new StringBuilder(" ");

    //     for(int i=0; i< str.length();i++){
    //         Integer count=1;

    //         while(i< str.length()-1 && str.charAt(i)== str.charAt(i+1)){
    //             count++;
    //             i++;
    //         }
    //         sb.append(str.charAt(i));

    //         if(count >1){
    //             sb.append(count.toString());
    //         }

    //     }
    //     return sb.toString();
    // }

    public static Boolean ValidAnagram(String strs, String strt){
        StringBuilder sb=new StringBuilder(" ");

        for (int i = 0; i < strs.length(); i++) {
                sb.append(strs.charAt(i));
                sb.toString();
                // System.out.println(sb);
        
            
            for(int j=0; j<strt.length();j++){
                if(strt.charAt(j)== sb.charAt(i)){
                    return true;
                }
            }
            
        }
        return false;

    }
    public static void main(String args[]){

        String strs="anagram";
        String strt="nagaramby";


        String str="aabbbcccdd";

        String str1="hi i am bishal kumar singh";

        System.out.println(ValidAnagram(strs, strt));
    }
}