

public class newPractice{

    public static void merge(int arra[], int si,int ei){
        
        if(si>=ei){
            return;
        }
        int mid=si + (ei-si)/2;

        merge(arra, si, mid);
        merge(arra, mid+1, ei);
        mergeSort(arra, si, mid, ei);
    }

    public static void mergeSort(int arra[], int si, int mid, int ei){
         int i=si;
         int j=mid +1;
        int k=0;
        int temp[]=new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arra[i] < arra[j]){
                temp[k]=arra[i];
                i++;
            }else{
                temp[k]=arra[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=arra[i++];
        }
        while(j<=ei){
            temp[k++]=arra[j++];
        }

        for(k=0,i=si; k<temp.length;k++,i++){
            arra[i]=temp[k];
        }
        


    }

    public static void PrintArra(int arra[]){
        for(int i=0; i<arra.length;i++){
            System.out.print(arra[i]+ " ");
        }
    }

    public static void Quicksort(int arra[], int si, int ei){
        if(si>=ei){
            return;
        }
        
        int Pidx=paration(arra, si, ei);
        Quicksort(arra, si, Pidx-1);
        Quicksort(arra, Pidx +1, ei);
    }

    public static int paration(int arra[], int si, int ei){

        int pivot=arra[ei];
        int i=si-1;

        for(int j=si; j<ei;j++){
            if(arra[j]<= pivot){
                i++;
                int temp=arra[j];
                arra[j]=arra[i];
                arra[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arra[ei]=arra[i];
        arra[i]=temp;
        return i;
    }

    // public static boolean  PermuteTwo(int arr1[], int arr2[], int k){
    //      Arrays.sort(arr1, Collections.reverseOrder());

    //      Arrays.sort(arr2);
    //      for(int i=0; i<arr1.length; i++){
    //         if(arr1[i] + arr2[i] < k){
    //             return false;
                
    //         }
    //      }
    //      return true;

    // }

    public static void FirstOccur(int arra[] , int si, int ei, int targer){
        
        if(si>=ei){
            System.out.println("not found");
            return;
        }
        
        if(arra[si]==targer){
            System.out.println("The first index of  " + targer  + "  is  " + si);
            return;
        }
        FirstOccur(arra, si + 1, ei, targer);

        


    }

    public static void lastOccur(int arra[], int si,int ei, int target){
        if(si>=ei){
            System.out.println("not found");
            return;
        }
        lastOccur(arra, si +1, ei, target);

        if(arra[si]==target){
            System.out.println("The first index of  " + target  + "  is  " + si);
            return;
        }
    }

    public static int celling(int arra[],int si, int ei, int value){
        if(si==arra.length){
            return -1;
        }

        int isfound=celling(arra, si+1, ei, value);

        if(isfound == -1 && arra[si] > value){
            return si;
            
        }

        return isfound;
    }
    public static int ProCelling(int arra[],int key){
        

        for(int i=0;i<arra.length;i++){
           if(arra[i]==key){
            return i;
           }

           if(arra[i]<key && arra[i+1] >=key){
            return i+1;
           }
           
    }
    return -1;
}




public static boolean   PairDiff(int arra[], int key){

    for(int i=0; i<arra.length;i++){
        int curr=arra[i];
        for(int j=i+1; j<arra.length;j++){
            if(Math.abs(curr-arra[j] )== key){
                return true;
            }
        }
    }
    return false;
}
    



 

    public static void main(String args[]){

        // int arra[]={3,7,8,2,9,5};
        // // merge(arra, 0, arra.length-1);
        // paration(arra, 0, arra.length-1);
        // PrintArra(arra);

        // int arr1[]={1,2,2,1};
        // int arr2[]={3,3,3,4};

        // System.out.println(PermuteTwo(arr1, arr2, 5));

        // int arra[]={1,2,3,4,5,6,7,2,4};
        // FirstOccur(arra, 0, arra.length, 4);
        // lastOccur(arra, 0, arra.length, 4);

        // int arra[]={1,2,8,10,10,12,19};
        // System.out.println(celling(arra,0,arra.length, 5));
        // System.out.println(ProCelling(arra, 5));
        
        int arra[]={5,20,3,2,50,80};
    

    if(PairDiff(arra, 78)==true){
        System.out.println("yes");
    }else{
        System.out.println("not found");
    }
    
    
}
}