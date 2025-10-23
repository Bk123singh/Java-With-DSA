public class shorting {


    public static void reverse(int arra[]){
            int start=0;
            int last=arra.length-1;

            while(start<last){
                int temp=arra[last];
                arra[last]=arra[start];
                arra[start]=temp;

                start++;
                last--;

            }
            
    }




    public static void ChangeVal(int arra[], int idx, int n){
        for(int i=0;i<arra.length;i++){
            if(i==idx){
                int temp=arra[idx];
                arra[idx]=n;
            }
        }
    }
    public static void main(String args[]){
        int arra[]={1,2,3,4,5,6};


       ChangeVal(arra, 2, 10);
        for (int i = 0; i <arra.length; i++) {
            System.out.print(arra[i] + " ");
        }
        


    }
}
