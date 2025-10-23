
import  java.util.*;
public class praall {
    public static int  Linear(int arra[], int key){
       for(int i = 0 ; i <= arra.length-1; i++){
        if(arra[i] == key){
            return i;
        }
       }
       return -1;
           
    }
    public static int  largest(int arra[]){
        int largest= Integer.MIN_VALUE;
        for(int i = 0; i <= arra.length-1;i++){
        if(largest < arra[i]){
            largest = arra[i];
        }
    }
    return largest;
    }
    public static int Binary(int arra[], int key){
        int start =0, end = arra.length-1;
        
        while(start <=end){
            int mid  = (start+end)/2;
            if(arra[mid]==key){
                return mid;
            }
            if(arra[mid] <= key){
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void reverse(int arra[]){
        int first=0;
        int last= arra.length -1;
        while(first<last){
             int temp = arra[last];
            arra[last] = arra[first];
            arra[first] = temp;
            first++;
            last--;
        }
       

    }
    public static void pairs(int arra[]){
        
        for(int i=0; i<=arra.length;i++){
            int curr= arra[i];
            for(int j=i+1; j<=arra.length ;i++){
                System.out.println("(" + curr + "," + arra[i] + ")");
            }
        }
        System.out.println();
    }
public static void subpair(int arra[]){
    int ts = 0;
    for(int i=0; i<=arra.length;i++){
        int start= i;
        for(int j = i+1; j<=arra.length;j++){
            int end = j;
            for(int k = start ;  k <= end; k++){
                System.out.println(arra[k] + " " );
            }
            ts++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("total subpairs " + ts);
    
}
public static void bubble(int arra[]){
    for(int turn = 0 ; turn <=arra.length; turn++){
        for(int j=0; j <= arra.length -1-turn; j++){
            if(arra[j] > arra[j+1]){
                int temp= arra[j];
                arra[j] = arra[j+1];
                arra[j] = temp;
            }
        }
    }
}

    public static void main(String [] args){
        int arra[] =  { 2,4,6,8,10};
        // int key = 10;
        //  int idx = Linear(arra, key);
        //  if(idx == -1){
        //     System.out.println("is not found");
        //  }else{ 
        //     System.out.println("key is at index : " +  idx);
        // System.out.println(largest(arra));
        // reverse(arra);
        // for(int i = 0 ; i<=arra.length;i++){
        //     System.out.println(arra[i] + " " );
        // }
        // System.out.println();
        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Enter coloum of matrix");
         n = sc.nextInt();
        System.out.println("Enter the row of matrix");
         m = sc.nextInt();
        
        int matrix1 [][]= new int[n][m];
        
        
       System.out.println("Enter the element of matrix : ");
       for(int i = 0 ; i<n;i++){
        for(int j = 0 ; j <m ; j++){
            matrix1[i][j]= sc.nextInt();
        }
       }
       for(int i = 0 ; i<= matrix1.length;i++){
        for(int j = 0 ; j <=matrix1[0].length ; j++){
            System.out.println(matrix1[i][j]);

    }  
    }
}
}
