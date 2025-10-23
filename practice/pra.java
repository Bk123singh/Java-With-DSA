import java.util.*;
public class pra {

    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value row: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of coloum");
        int m = sc.nextInt();
        int arra[][] = new int[n][m];
        for (int i = 0; i <n; i++) {
            for(int j=0; j<m;j++){
                arra[i][j]= sc.nextInt();
            }
            
        }
        for(int i =0; i<n;i++){
            for(int j =0;j<m;j++){
                System.out.println(arra[i][j]);
            }
        }
    }
}