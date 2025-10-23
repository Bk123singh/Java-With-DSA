import java.util.*;
public class diagonalSum {
    public static int Value(int arra[][]){
        int sum = 0;
        for(int i=0; i<arra.lenght; i++){
            for(int j =0; j < arra[0].length;j++){
                if(i==j){
                    sum+=arra[i][j];
                }
                else if(i+j==arra[i][j]){
                    sum+=arra[i][j];
                }
            }
        }
        return sum;
    }


public static void main(String [] args){
    int arra[][] = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

    System.out.println(Value(arra));

    }
}