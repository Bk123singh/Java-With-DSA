import java.util.*;
public class practice18{
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
        int arra [] = {2,4,6,8};
        subarra(arra);
    }
}