import java.util.*;
public class practi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  row in arra");
        int n = sc.nextInt();
        System.out.println("Enter the coloum in arra");
        int m = sc.nextInt();
        int arra[][] = new int[n][m];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                arra[i][j] = sc.nextInt();

            }
        }
        System.out.println(" Array elements is: ");
        for(int i=0; i<arra.length;i++){
            for(int j=0; j<arra.length;i++){
                System.out.print(arra[i][j] + " ");

            }
        }
        System.out.println();

    }
}