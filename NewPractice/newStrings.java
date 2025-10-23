

public class newStrings{

    public static void Laxico(String str[]){
        String largset=str[0];
        for(int i=1; i<str.length;i++){
            if(largset.compareTo(str[i]) < 0){
                largset=str[i];
            }
        }
        System.out.println(largset);
    }

    public static String ToupperCase(String str , StringBuilder sb){
        
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length();i++){
            if(str.charAt(i)==' ' && i< str.length()-1){
                sb.append(str.charAt(i));
                i++;
             sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
         return  sb.toString();
    }

    public static String comprass(String str, StringBuilder sb){

    
        for(int i=0;i<str.length();i++){
          Integer count=1;
            while(i< str.length()-1 && str.charAt(i)==str.charAt(i+1)){
               
                    count++;
                    i++;
            }
            sb.append(str.charAt(i));
            if(count >1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void PrintStr(StringBuilder sb){
        for(int i=0; i<sb.length();i++){
            System.out.print(sb.charAt(i) +"");
        }
    }
    public static void main(String args[]){
        // String str[]={"apple", " mango", "banana"};

        // Laxico(str);
        StringBuilder sb=new StringBuilder("");


        // String str="hi i' m bishal kumar ";
    //    ToupperCase(str, sb);
        String str="aaabbcccdd";
        comprass(str, sb);
       System.out.println(sb);
        
        
    }
}