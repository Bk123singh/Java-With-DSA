import java.util.*;
public class pactica19 {
    public static void Printarra( int arra[][]){
        
    }

    public static void main(String [] args){
        int arra[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix elements:");
        for(int i = 0 ; i < arra.length; i++){
            for(int j =0; j < arra[0].length; j++){
             arra[i][j] =  sc.nextInt();
            }
        }
        for(int i = 0; i < arra.length ;i++){
            for(int j = 0; j < arra[0].length;){
                System.out.println(arra[i][j]);
            }

        }

    }
}