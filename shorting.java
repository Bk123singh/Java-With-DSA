public class shorting {
    public static void bubbleshort(int arr[]){
        for(int trun = 0; trun< arr.length-1; trun++){
            for(int j =0; j< arr.length -1-trun; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }  
        }
    }
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
      int arr[] = {5,4,1,3,2}; 
      bubbleshort(arr); 
      printarr(arr);
    }
}