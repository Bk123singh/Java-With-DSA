
import java.util.*;

public class find {

    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        Scanner sc= new Scanner(System.in);
        int arra[] =new int[5];
        for(int i = 0; i<=4 ; i++){
            arra[i]= sc.nextInt();
        }

        for(int i = 0; i<5;i++){
             sum1 +=arra[i];
        }
        for(int i = 1; i<5;i++){
             sum2 +=arra[i];
        }
        System.out.println(sum1 + " " + sum2);
    }
}