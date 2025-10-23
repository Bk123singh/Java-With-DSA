

public class newMerg {

    public static void  mergeshort(int arra[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;

        mergeshort(arra, si, mid);
        mergeshort(arra,mid+1, ei);
        merge(arra, si, mid, ei);
        
    }

    public static void merge(int arra[], int si, int mid, int ei ){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;


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

        for(k=0,i=si;k<temp.length;k++, i++){
            arra[i]=temp[k];
        }
    }

    public static void PrintArra(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i]+" ");
        }
    }



    public static void Quick(int arra[], int si, int ei){
        if(si>=ei){
            return;
        }
        
        int Pidx=Pratation(arra, si, ei);
        Quick(arra, si, Pidx-1);
        Quick(arra, Pidx+1, ei);
    }

    public static int Pratation(int arra[],int si, int ei){

        int i=si-1;
        int pivot=arra[ei];

        for(int j=si;j<ei;j++){
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

    

    public static void main(String args[]){

        int arra[]={3,5,1,8,6};
        Quick(arra, 0, arra.length-1);
        PrintArra(arra);

    }
}