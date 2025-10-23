import java.util.*;
public class arra { 

    public static void main(String [] args){
        int matrix[][] = new int[3][3];
        int n = matrix.lenght, m =  matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n ; i++){
            for(int j = 0 ;j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for( int i =0 ; i < n ; i++){
            for( int j = 0; j<m ;j++){
                System.out.println(matrix[i][j]);
            }
        }
        System.out.println();
    }
}