import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arra[][] = new int[2][2];
        for(int i=0; i<arra.length;i++){
            for(int j=0; j<arra.length;i++){
                arra[i][j]=sc.nextInt();
                
            }
        }

        for(int i=0;i<arra.length;i++){
            for(int j=0;j<arra.length;j++){
                System.out.println(arra[i][j] + " ");
            }
        }
    }
}

    
