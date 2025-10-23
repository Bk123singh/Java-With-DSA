public class problem11{
    //problem 11
    public static int TilingPro(int n){
        if(n==0 || n == 1){
           return 1;
        }
        // kaam
        // vertical choice
        // int fnm1= TilingPro(n-1);

        // horziontal problem
        // int fnm2 = TilingPro(n-2);
        // int totalways = fnm1 +fnm2;
        return  TilingPro(n-1) + TilingPro(n-2);
    }
// problem 12
//renive Duplicates in a string
// " appnnacollage"

public static void Dupli(String str,int idx, StringBuilder newstr, boolean map[]){
if(idx == str.length()){
    System.out.println(newstr);
    return;
}
//kaam
char currChar = str.charAt(idx);
if(map[currChar - 'a'] == true){
    //duplicate
    Dupli(str, idx+1, newstr, map);
} else {
    map[currChar - 'a'] = true;
    Dupli(str, idx+1, newstr.append(currChar), map);
}

}


    public static void main(String []args){
    //   System.out.println( TilingPro(6) );
    // String str = "appnnacollage";
    // Dupli(str, 0, new StringBuilder(" "), new boolean[26]);
        System.out.println(TilingPro(4));
    }
}