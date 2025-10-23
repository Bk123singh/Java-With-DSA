public class PracticeNew {
    public static void perString(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0, i) + str.substring(i+1);
            perString(newStr, ans+curr);
        }
    }

    

    public static int  arraSubset(int arra[], int si, int ei){
        int temp[]=new int[ei-si];
        int k=0;
        for(int i=si;i<ei;i++){
            temp[i]+=arra[i];
            k++;
        }

       return temp[k];

    

    }

    public static void Arrsub(int arra[], int temp[]){
        if(arra.length==0){
            for (int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
            return;
        }

        for(int i=0;i<arra.length;i++){
            int curr=arra[i];
            int newTemp=arraSubset(arra, 0, i)+ arraSubset(arra, i+1, arra.length);
            
            // Arrsub(newTemp, temp+curr);

        }
    }

    public static void compress(String str){
        int k=0;

        String newStr="";

        for(int i=0;i<str.length();i++){
            newStr+=str.charAt(i);
        
        for(int j=0;j<str.length();j++){
            if(newStr.compareTo(str.charAt(i) < 0)
                k++;
                
            }
        }
    }
    }

    public static void main(String[] args){
        String str="abc";
        compress(str);

        // // perString(str, " ");

        // int arra[]={1,2,3,4};
        // arraSubset(arra, 0, 1);
    }
}
