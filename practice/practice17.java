import java.util.*;
public class practice17 {
    public static void reverse(int arra[]){
        int first = 0, last = arra.length-1;
        while(arra[first]<=arra[last]){
            int temp = arra[last];
            arra[last] = arra[first];
            arra[first] = temp;
        }

    } 
    public static void pairs( int arra[]){
        for(int i = 0; i < arra.length;i++){
            int curr = arra[i];
            for(int j = i+1; j < arra.lenght ; j++){
                System.out.println("( " +  curr + " , "  + arra[j] + ")");
            }
            System.out.println();
        }
    }
    public static void printarra(int arra[]){
        for(int i=0; i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
        System.out.println();

    }
    public static void subarra(int arra[]){
        int ts;
        for(int i = 0; i<arra.length;i++){
            int start = i;
            for(int j= 0; j<arra.lenght; j++){
                int end = j;
                for( int k= start; k<end; k++){
                    System.ou.println(arra[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subpairs" + ts);
    }


 
    public static void main(String [] args){
        int arra [] = { 2,4,5,6,8};
      subarra(arra);

        
       
        
       
       
    }
}