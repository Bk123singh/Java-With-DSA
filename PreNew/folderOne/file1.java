
import java.util.Scanner;



public  class file1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    
        int arra[]=new int[10];

        System.out.println("Enter the arra Number : ");

        for(int i=0;i<arra.length;i++){
            arra[i]=sc.nextInt();

        }


    System.out.println("Your Array value is here: ");
        int sum1=0;
    for(int i=0;i<arra.length;i++){
        sum1+=arra[i];
        System.out.print(arra[i] + " ");
    }


    int arraA[]=new int[10];
    System.out.println("Enter the second value of array");

    for (int i = 0; i < 10; i++) {
        arraA[i]=sc.nextInt();
        
    }
    System.out.println("Your Array value is here: ");
    int sum2=0;

    for(int i=0;i<arra.length;i++){
        sum2+=arraA[i];
        System.out.print(arra[i] + " ");
    }



    System.out.println("sum of array one : " + sum1);

    System.out.println("sum of array two :  " +  sum2);

    }
}