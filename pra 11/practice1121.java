import java.util.*;
public class practice1121 {

    public static void swapNum(int a, int b){
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("A is: "  + a);
        System.out.println("B is: " + b);
    }
    public static void swapArra(int arra[]){
        int first= 0;
        int last=arra.length-1;
        while(first<last){
            int temp=arra[first];
            arra[first]=arra[last];
            arra[last]=temp;
            first++;
            last--;
        }

        for(int i=0;  i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String arga[]){
        Scanner sc = new Scanner(System.in);
        // swapNum(5, 10);
        int arra[]= new int[5];
        System.out.println("Enter the array elements");
        for(int i=0;i<arra.length;i++){
            arra[i]=sc.nextInt();
        }

        swapArra(arra);
        

        

    }
}