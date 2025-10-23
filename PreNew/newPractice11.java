public class newPractice11{

    public static void mergeshort(int arra[] , int si, int ei){
        if(si==arra.length){
            
           return;
        }

        if(arra[si] <arra[si+1]){
            System.out.println(arra[si]);
        }
        mergeshort(arra, si+1, ei);
       

        
    }


    public static void  Racap(int arra[]){
        int count=0;
        for(int i=0;i<arra.length;i++){
            int curr=arra[i];

            for(int j=i+1;j<arra.length;j++){
                if(arra[i]>arra[j]){
                    count++;
                }
            }
        }
        System.out.println(count);

       
    }

    public static int RacapMerge(int arra[],int temp[], int si, int ei){
        int count=0;
        if(si < ei){

            int mid=(ei+si)/2;

            count+=RacapMerge(arra,temp, si, mid);
            count +=RacapMerge(arra,temp, mid+1, ei);
            count +=merge(arra,temp, si,mid, ei);

        }
        return count;
    }

    public static int merge(int arra[],int temp[],  int si, int mid, int ei){
        
        int i=si;
        int j=mid+1;
        int k=si;
        int count=0;

        while(i<=mid && j<=ei){
            if(arra[i] <= arra[j]){
                temp[k++]=arra[i++];
                
            }else{
                temp[k++]=arra[j++];
                count +=(mid-i+1);   
            }
        }

        while(i<=mid){
            temp[k++]=arra[i++];

        }
        while(j<=ei){
            temp[k++]=arra[j++];

    for( i=si;i<ei;i++){
        arra[i]=temp[i];
    }
    
    }
    return count;
}



public static void MinimumSwap(int arra[]){
    int count=0;
    for(int i=0; i<arra.length;i++){
        int curr=arra[i];
        for(int j=i+1; j<arra.length;j++){
            if(curr > arra[j]){
                int temp=curr;
                curr=arra[j];
                arra[j]=temp;
                count++;

                System.out.println(curr + arra[i]);
            }
        }
    }
    System.out.println("total swap value is : " + count);
}


public static void PrintArr(int arra[]){
    for(int i=0; i<arra.length;i++){
        System.out.print(arra[i] + " ");
    }
}
   public static void main(String[] args) {
    // int arra[]={2,4,1,3,5};   

    // int temp[]=new int[arra.length];

    // // Racap(arra);
    // System.out.println(RacapMerge(arra,temp, 0, arra.length-1));

    int arra[]={2,8,5,4};
    MinimumSwap(arra);
    PrintArr(arra);


   }
    
}