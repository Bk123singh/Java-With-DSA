import java.util.*;
public class Solution {

    public static void main(String [] args){
        int i,j;
        int poA=0;
        int poB=0;
        Scanner sc = new Scanner(System.in);
        int a[]= new int[3];
        for( i=0;i<=2; i++){
            a[i]=sc.nextInt(); 
        }
        int b[] = new int[3];
        for( i=0; i<=2; i++){
            b[i] = sc.nextInt();
        }
        for( i=0; i<=2; i++){
            
                if(a[i]>b[i]){
                   poA+=1; 
                } else if (a[i]< b[i]){
                    poB += 1;
                }
                else{
                    poA+=0;
                    poB+=0;
                }
            
        }
        System.out.println( poA +  " "  + poB  );
    }
}
            