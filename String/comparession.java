public class comparession {
    public static String finding(String str){
        String  Str = " ";
        
        for( int i = 0; i < str.length(); i++){
            Integer count = 1;
            While(i < str.length()-1  &&  str.charAt(i) == str.charAt(i+1)){
                    count++;
                    i++;
            
            }
            if(count > 1){ 
                Str += count.toString();
            }
        }
        return Str;
    }

    public static void main(String[] args) {
        String str = "aaabbccc";
    }
}