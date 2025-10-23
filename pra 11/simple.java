import java.util.*;
public class simple{
    public static void printArra(int arra[]){
        System.out.println("Your array elements are: ");
        for(int i=0;i<arra.length;i++){
            for(int j=0;j<arra.length;j++){
                System.out.println(arra[i]+ " ");
        }
    }
    System.out.println();

    }
    
public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    int arra[]=new int[5];
    System.out.println("Enter the array elements: ");
    for(int i=0;i<arra.length;i++){
        for(int j=0;j<arra.length;j++){
            arra[i]=sc.nextInt();
    }
}

    printArra(arra);
}
}