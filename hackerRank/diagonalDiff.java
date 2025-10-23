import java.util.*;
public class diagonalDiff {
    public static int  Diago(Integer arra[][]){
        int sum1=0;
        int sum2=0;
        for(int i=0; i <arra.length;i++){
            for(int j =0; j<arra.length;j++){
                if(i==j){
                     sum1+= arra[i][j];     
                } 
                
                if(i+j==arra.length-1){
                    sum2+=arra[i][j];
                }
            }
        }
        return Math.abs(sum1 - sum2);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n =sc.nextInt();

        Integer arra[][] =new Integer[n][n];
        System.out.println(" Enter the array elements");
        for(int i = 0; i<arra.length; i++){
            for(int j =0; j <arra.length; j++){
                arra[i][j]=sc.nextInt();
            }
        }
        System.out.println("difference " + Diago(arra));
  }
}
