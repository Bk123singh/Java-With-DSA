public  class permutation {
    public static void Permuta(String str, String ans){
        //base case
            if(str.length() ==0){
                System.out.println(ans);
                return;

            }

        //recuration
            for(int i=0; i<str.length(); i++){
                char curr = str.charAt(i);
                // "abcde" = "ab"+"de"
                 String Newstr= str.substring(0 , i) + str.substring(i+1);
                Permuta(Newstr, ans+curr);
            }

    }

    public static void main(String[] args) {
        String str = "abc";
        Permuta(str, " ");

    }
}   
  