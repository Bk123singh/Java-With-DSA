import java.util.*;
public class practiceshortin{
    public static void bubble(int arra[]){
        for(int i= 0; i <  arra.length -1; i++){
            for(int j = 0; j<arra.length- 1-i;j++ ){
                if (arra[j] > arra[j+1]){
                    int temp = arra[j]; 
                    arra[j] = arra[j+1];
                    arra[j+1]= temp;
                }
            }
        }
    }
    public static void Praintarray(int arra[]){
        for(int i = 0 ; i <arra.length; i++){
            System.out.print(arra[i] + " ") ;
        }
        System.out.println();
    }
    public static void selection(int arra[]){
        for(int i = 0; i < arra.length - 1; i++){
            int minpos = i;
            for( int j= i+1; j< arra.length; j++){
                if( arra[minpos] > arra[j]){
                    minpos =j;
                }
            }
            int temp = arra[minpos];
            arra[minpos] = arra[i];
            arra[i] = temp;
        }

    }
    


    public static void main(String[] args) {
        int arra[] = {2,4,3,5,1};
        selection(arra);
        Praintarray(arra);
    }
}