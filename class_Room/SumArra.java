
public class SumArra {
    public static void Sum(int arra[]){
        int sum=0;
        for(int i = 0; i<arra.length;i++){
            sum+=arra[i];
        }
        System.out.println("sum = " + sum);
    }
    public static void largest(int arra[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arra.length;i++){
            if(largest < arra[i]){
                largest = arra[i];
            }
        }
        System.out.println("largest value  in arra = " + largest);
    }

    public static void Min(int arra[]){
        int mini= Integer.MAX_VALUE;
        for(int i = 0; i< arra.length; i++){
            if(mini > arra[i]){
                mini=arra[i];

            }
        }
        System.out.println("Minimun value of arra is : "  + mini);
    }

    public static int Binear(int arra[],int key){
        int start = 0; 
        int end = arra.length-1;
        int i;
        while(start <= end){
            int mid = start+end/2;
            if(arra[mid]== key){
                return mid;
            }
            if(arra[mid] < key){
                mid =mid+1;
                return mid;
            }
            if(arra[mid] > key){
                mid =mid-1;
                return mid;
            }
    
        }
        return -1;

    }

    public static void Oddsum(int arra[]){
        int sum = 0;
        for(int i=1;i<arra.length;i=i+2){
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
    public static void evenSum(int arra[]){
        int sum= 0; 
        for(int i=0; i<arra.length;i=i+2){
            sum+= i;
        }
        System.out.println("sum = " +sum);
    }

    public static void reverse(char arr[]){
    int start = 0;
    int last= arr.length-1;
    while(start<=last){
        char temp = arr[last];
        arr[last] = arr[start];
        arr[start] = temp;
        start++;
        last --;
    }
    for(int i = 0; i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}

public static void main(String args[]){
 int arra[]= {1,2,4,5,6,7,10,2};
 int key =10;
 char arr[] = { 'a', 'b','c', 'd','e'};
 reverse(arr);
 
}
}
