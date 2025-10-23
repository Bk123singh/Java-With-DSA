import java.util.*;
public class arrar2d {

    public static void main(String [] args){
        int matrix [][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for matrix");
        for(int i = 0; i < matrix.length ; i++){
            for( int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Our matrix is here");
        for(int i = 0; i =matrix.length ; i++){
            for(int j=0; j= matrix[0].length;j++){
                system.out.println(matrix[i][j]);
            }
        }
    }

}