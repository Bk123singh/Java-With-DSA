public class diagonal1{
    public static int diagonasum(int arra[][]){
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arra.length;i++){
            for(int j=0;j<arra.length;j++){
                if(i==j){
                    sum1+=arra[i][j];
                    
                }
                if(i+j==arra.length-1){
                    sum2+=arra[i][j];
                }
            }
        }
        return sum1-sum2;
    }
    public static void main(String args []){
        int arra[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

    System.out.println("Diagonal sum = " + diagonasum(arra));
    }
}