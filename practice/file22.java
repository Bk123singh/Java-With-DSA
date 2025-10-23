import java.util.*;

 public class file22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        int arra[][] = new int[n][m];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arra[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arra[i][j] + " ");
            }
            System.out.println();
        }
    }
}