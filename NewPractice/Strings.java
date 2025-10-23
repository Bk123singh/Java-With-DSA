public class Strings {

    public static boolean Pallindrome(String str1){
        int n=str1.length();

        for(int i=0; i<str1.length()/2;i++){
            if(str1.charAt(i)!=str1.charAt(n-i-1)){
                return false;
            }
        }

        return true;
    }

    public static float ShorPath(String strs){
        int x=0, y=0;

        for(int i=0; i<strs.length();i++){
            char dir=strs.charAt(i);

            if(dir=='S'){
                x--;
            }

            if(dir=='N'){
                x++;
            }

            if(dir=='E'){
                y++;
            }
            if(dir=='W'){
                y--;
            }
        }

        int x2=x*x;
        int y2=y*y;

        return (float)Math.sqrt(x2 +y2);
        

    }

    public static String SubString(String str, int si, int en){
        String subStr=" ";
        for(int i=si; i<=en;i++){

            subStr+=str.charAt(i);
            
        }

        return subStr;
        
    }

    public static String ToUppercase(String str){

        StringBuilder sb=new StringBuilder(" ");

        char ch=Character.toUpperCase(str.charAt(0));

        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));


            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String Capatilize(String str){
        StringBuilder sb=new StringBuilder(" ");

        for(int i=0;i<str.length();i++){
            sb.append(Character.toUpperCase(str.charAt(i)));
        }

        return sb.toString();

    }

    public static String  Compres(String str){
        
        StringBuilder sb=new StringBuilder();

        for(int i=0; i< str.length();i++){
            Integer count=1;

            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
                
            }

            sb.append(str.charAt(i));
            if(count >1 ){
                sb.append(count.toString());
            }            
        }

        return sb.toString();
    }


    public static int  Kadans(int arra[]){
        int curr=0;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<arra.length;i++){
            curr+=arra[i];
            if(curr <0){
                curr=0; 
            }
            max=Math.max(max, curr);
        }
        return max;
    }

    public static Boolean Duplicate(int arra[]){
      int lp=0; 
      int rp=arra.length-1;
      while (lp<rp) {
        if(arra[lp]==arra[rp]){
            return true;
        }

        if(arra[lp] < arra[rp]){
            lp=lp+1;
        }
        else {
            rp=rp-1;
        }
      }
      return false;
    }


    public static void main(String args[]){
    //     String str="Bishal Kumar";

    //     String str1="noon";

    //     String strs="WNEENESENNN";

    //     // System.out.println("Sub String is here: " + SubString(str,2, 5));

    //     // System.out.println(str.substring(2,5));

    //     // System.out.println(ShorPath(strs));

    //     // System.out.println(Pallindrome(str1));

    //  String Friuts[]={"apple", "mango", "banana"};
    //  String largest=Friuts[0];

    // for(int i=1; i<Friuts.length;i++ ){
    //    if(largest.compareTo(Friuts[i])<0){
    //     largest +=Friuts[i];
    //    }

    // }
    // System.out.println(largest);

    // String str="hi am bishal kumar and i leave at mathura pur my hobby is playing cricket";
    
    // System.out.println(ToUppercase(str));
    // System.out.println(Capatilize(str));

    // String str="abc";

    // System.out.println(Compres(str));

        // int arra[]={-2,1,-3,4,-1,2,1,-5,4};
        // System.out.println(Kadans(arra));

        int arra[]={1,2,3,4};
        System.out.println(Duplicate(arra));
        

    }
    
}
