
import java.util.Scanner;

public class arrain {

    public static void UpdateMarks(int marks[]){
        for(int i=0; i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }

    public  static void LinearSearch(int num[], int key){
        for(int i=0; i<num.length;i++){
            if(num[i]==key){
                System.out.println("Find the value of at index : " + i);
            }
           
        }

    }

    public static int largestval(int num[]){
        int lar=Integer.MIN_VALUE;

        for(int i=0; i<num.length;i++){
            if(lar<num[i]){
                lar=num[i];
            }
        }
        return lar;
    }

    public static int lowestVal(int num[]){
        int low=Integer.MAX_VALUE;

        for(int i=0; i<num.length;i++){
            if( low >num[i]){
                low=num[i];
            }
        }
        return low;
    }

    public static void main(String agrs []){
        int arra[]=new int[5];

        Scanner sc=new Scanner(System.in);

        int num[]={1,4,5,7,2,8};

       System.out.println("Largest value in arra is : " + largestval(num));
       System.out.println("Lowest value in arra is : " + lowestVal(num));


        // LinearSearch(num, 5);


        // UpdateMarks(marks);


        // for(int i=0; i<marks.length;i++){
        //     System.out.println("Your marks at index No.:" + i + "  : " + marks[i]);
        // }



    }
}
