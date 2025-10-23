

public class recustionPrac {

    public static void Convert(String str,  int i, StringBuilder sb){

        if(i==str.length()){
            System.out.println(sb.toString());
            return;
        }

        if(str.charAt(i)== '1'){
            sb.append("One");
        }
        if(str.charAt(i)== '9'){
            sb.append("Nine");
        }
        if(str.charAt(i)== '4'){
            sb.append("Four");
        }
        if(str.charAt(i)== '7'){
            sb.append("Seven");
        }

        Convert(str, i +1, sb);


    }

    public static void  Findlength(String str, int i, int count){
        
        if(i==str.length()){
            System.out.println(count);
            return ;
        }
        
        count++;
        

       Findlength(str, i+1, count);



    }

    public static void Arrange(String str, int i){
       

       
    }

    public static boolean findDuplicate(int arra[], int i){
            if(i==arra.length){
                return false;
                 
            }

            if(arra[i]==arra[i+1]){
                return true;
            }
            return findDuplicate(arra, i+1);
    }

    
 public static boolean FindDupli(int arra[]){
    int lp=0;
    int rp=arra.length-1;
    
    while(lp<rp){
        if(arra[lp]==arra[rp]){
            return true;
        }
        if(arra[lp]<arra[rp]){
            lp=lp+1;
        }else{
            rp=rp-1;
        }
        
    }
    return false;
 }
    public static  void main(String args[]){

        // String str="1947";

        String str="abcab";
        int arra[]={1,2,3,4,5};
        System.out.println(FindDupli(arra));



        // Convert(str, 0, new StringBuilder(""));
        // Findlength(str, 0,0);

    }
    
}
