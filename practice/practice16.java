import java.util.*;
public class practice16 {
    public static void pairs(int arra[]){
        for ( int i= 0; i<arra.length; i++){
            int curr = arra[i];
            for(int j= j+1;j<arra.lengh;j++){
                System.out.println("(" + curr + "," +  arra[j] + ")");
            }
            system.out.println();

        }

    }

    public static void main(String [] args){
        int arra[] ={ 2,4,6,8};
        pairs(arra);

    }
}