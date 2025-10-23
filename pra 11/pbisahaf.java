

public class pbisahaf {
    public  static void print(int arra[]){
        System.out.println("your array elements are: ");
        for(int i=0; i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
        System.out.println();
    }
    public static void swapArra(int arra[]){
        int first=0;
        int last= arra.length-1;
        while(first<last){
            int temp= arra[first];
            arra[first]=arra[last];
            arra[last]=temp;
            first++;
            last--;
        }
    }
    public static void largest(int arra[],int key){
      int largest=Integer.MIN_VALUE;
      for(int i=0; i<arra.length;i++){
        if(largest<arra[i]){
            largest=arra[i];
        }
      } 
      System.out.println("largest number is: " + largest); 

    }
    public static int  binary(int arra[], int key){
        int start=0;
        int end=arra.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(arra[mid]==key){
                return mid;
            }
            if(arra[mid]<key){
                return start=mid+1;
            }
            else{
                return end=mid-1;
            }
            
        }
        return -1;
    }
    public static void subPairs(int arra[]){
        int count=0;
        for(int i=0;i<arra.length;i++){
            for(int j=i+1;j<arra.length;j++){
                System.out.print("( " + arra[i] + " , " + arra[j] + " )" );
                
            }
            count+=i;
        }
        System.out.println();
        System.out.println(count);
    }

    public static void main(String args[]){
        int arra[]= {1,2,3,4,5,6,7,8};
        // System.out.println("Enter the array elements");
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<arra.length;i++){
        //     arra[i]=sc.nextInt();
        // }
        // // swapArra(arra);
        // largest(arra, 3);
        // // print(arra);

        // int hh=binary(arra, 5);
        // if(hh==-1){
        //     System.out.println("key not found");
        // }else{
        //     System.out.println("Find at index is: " + hh);
        // }
        subPairs(arra);
    
    }
}