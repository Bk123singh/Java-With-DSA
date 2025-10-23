

public class AdvShort {

    public static void QuickShort(int arra[] , int si, int ei){
        if(si>=ei){
            return;
        }

        int PIdx=parsition(arra, si, ei);
        QuickSort(arra, si,  PIdx-1);
        QuickSort(arra, PIdx+1, ei);
    }

    public static int parsition(int arra[], int si, int ei){
        int pivot=arra[ei];
        int i=-1;
        for(int j=si; j<ei; j++){
            if(arra[j]<= pivot){
                i++;
                int temp =arra[j];    
                arra[j]=arra[i];
                arra[i]=temp;

            
            }
        }
        i++;
        int temp =pivot  ;  
        arra[ei]=arra[i];
        arra[i]=temp;
        return i;
    }

    public static  void QuickSort(int arra[], int si, int ei){
        if(si>=ei){
            return;
        }

        int Pidx=paratiton(arra, si, ei);

        QuickSort(arra, si, Pidx-1);
        QuickSort(arra, Pidx+1, ei);
    }
    public  static int paratiton(int arra[], int si, int ei){
        int pivot=arra[ei];
        int i=si-1;
        for (int j = si; j <ei; j++) {
            if(arra[j] <= pivot){
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

    public static void PrintArr(int arra[]){
        for(int i=0; i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
    }

    public static int FindVal(int arra[], int si, int ei, int target){
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;

        if(arra[mid]==target){
            return mid;
        }

        if(arra[si]<= arra[mid]){
            if(arra[si]<=target && target<=arra[mid]){
                return FindVal(arra, si, mid-1, target);
            }else{
                return FindVal(arra, mid+1, ei, target);
            }
        }else{
            if(arra[mid+1]<=target && target<=arra[ei]){
                return  FindVal(arra, mid+1, ei, target);
            }else{
                return FindVal(arra, si, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        // int arra[]={6,3,9,8,2,5};

        int arra[]={4,5,6,7,0,1,3};

        // QuickShort(arra, 0, arra.length-1);
        // PrintArr(arra);
       int ans= FindVal(arra, 0, arra.length-1, 0);
       System.out.println(ans);
    }
}
