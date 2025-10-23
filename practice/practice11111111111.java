
import java.util.Scanner;


public class practice11111111111 {

    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of coloums");
        int n = sc.nextInt();
        System.out.println("Enter the value of coloums");
        int m = sc.nextInt();

        int arra[][] = new int[n][m];
        System.out.println("Enter the array elements");
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                arra[i][j]=sc.nextInt();
            }
        }
    
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(arra[i][j] + " ");
            }
        }
        System.out.println();


    }
}