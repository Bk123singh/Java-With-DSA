


public class Tarra {

    public static int DiagonalSum(int arra[][]){
        int dgSum=0;
        for(int i=0; i<arra.length;i++){
            for(int j=0; j<arra.length;j++){
                if(i==j){
                    dgSum+=arra[i][j];
                } else{
                    if(i+j==arra.length-1){
                        dgSum+=arra[i][j];
                    }
                }

            }
        }
        return dgSum;
    }


    public static void Twosum(int arra[],int target){
        for(int i=0;i<arra.length;i++){
                int curr=arra[i];
            for(int j=i+1; j<arra.length;j++){
                if(curr+arra[j]==target){
                    System.out.println(i  + " "  + j);
                }
            }
        }
    }
    public static void main(String args[]){

    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the value of row");
    //     int n=sc.nextInt();
    //     System.out.println("Enter the value of column");
    //     int m=sc.nextInt();
    //     int arra[][]=new int[n][m];


    //     System.out.println("Enter the all array elements: ");
    //     for(int i=0; i<n;i++){
    //         for(int j=0; j<m;j++){
    //            arra[i][j]= sc.nextInt();
    //         }
    //     }

    //     System.out.println("Your Enter element is Here: ");

    //     int sum=0;
    //     for(int i=0;i<arra.length;i++){
    //         for (int j = 0; j < arra.length; j++) {
    //             System.out.print(arra[i][j] + " ");
    //             sum+=arra[i][j];
    //         }
    //         System.out.println(" ");
            
    //     }

    //     System.out.println("total sum all array value: " + sum);


    //    System.out.println( "Diagonal Sum: " + DiagonalSum(arra));
        

        int arra[]={3,4,9,6,4};
        int target=8;

        Twosum(arra, target);

    }
}
