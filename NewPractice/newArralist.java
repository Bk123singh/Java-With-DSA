

public class newArralist {

    public static void mostContaingWater(int arra[]){
        int Mwater=0;
        int lp=0;
        int rp=arra.length-1;
        while(lp<rp){
            int ht=Math.min(arra[lp], arra[rp]);
            int width=rp-lp;
            int maxwater=width*ht;
            Mwater=Math.max(maxwater, Mwater);

            if(arra[lp]< arra[rp]){
                lp++;

            }else{
                rp--;
            }
            
        }

        System.out.println("Most Containing water is : " +  Mwater);
    }
     

    public static boolean  TwoSum(int arra[], int target){

        int bp=-1;
        int n=arra.length;
        for(int i=0;i<arra.length;i++){
            if(arra[i] > arra[i+1]){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;

        while(lp!=rp){
            if(arra[lp]+arra[rp] == target){
                return true;
            }
            if(arra[lp]+arra[rp]< target){
                lp=(lp+1)%n;
            }else{
                rp=(rp+n-1)%n;
            }
        }
        return false;


    }

    public static void  mergesort(int arra[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid=si + (ei-si)/2;

        mergesort(arra, si, mid);
        mergesort(arra, mid+1, ei);
        merge(arra, si, mid, ei);

    }

    public static void  merge(int arra[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        
        while(i<=  mid &&  j<= ei){
            if(arra[i]< arra[j]){
                temp[k]=arra[i];
                i++;
            }else{
                temp[k]=arra[j];
                j++;
            }
            k++;
        }

        while(i<= mid){
            temp[k++]=arra[i++];
        }
        while(j<=ei){
            temp[k++]=arra[j++];
        }

        for( k=0, i=si; k<temp.length;k++, i++){
            arra[i]=temp[k];
        }
    }
    public static void PrintArr(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i]+ " ");
        }
    }

    public static void Quick(int arra[],int si, int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partision(arra, si, ei);
        Quick(arra, si, pIdx-1);
        Quick(arra, pIdx+1, ei);
    }

    public static int partision(int arra[], int si, int ei){
        int pivot=arra[ei];
        int i=si-1;

        for(int j=si; j< ei; j++){
            if(arra[j]< pivot){
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
    public static void main(String[] args) {
        // int arra[]={1,8,6,2,5,4,8,3,7};
        int arra[]={11,15,6,8,9,10};
        // System.out.println(TwoSum(arra, 16));

       Quick(arra, 0, arra.length-1);
        PrintArr(arra);


        
        
    }
}