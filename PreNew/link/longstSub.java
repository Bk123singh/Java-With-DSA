public class longstSub{

    public static void Quick(int arra[], int si, int ei){
        if(si>=ei){
            return;
        }

        int Pidx=pratation(arra, si,ei);
        Quick(arra, si,Pidx-1);
        Quick(arra, Pidx+1, ei);

    }

    public static int pratation(int arra[], int si, int ei){

        int i=si-1;
        int pivot=arra[ei];

        for(int j=si;j<ei;j++){
            if(arra[j]<=pivot){
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

    public static void PrintArra(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
    }


    public static int SearchRotat(int arra[], int si, int ei,int target){
        if(si>ei){
            return -1;
        }

        int mid=si + (ei-si)/2;

        if(arra[mid]==target){
            return mid;
        }

        if(arra[si]<=arra[mid]){
            if(arra[si]<=target && target<=arra[mid]){
                return SearchRotat(arra, si, mid-1, target);
            }else{
                return SearchRotat(arra, mid+1, ei, target);
            }
        }else{
            if(arra[mid]<=target && target<=arra[ei]){
                return SearchRotat(arra, mid+1, ei, target);
            }else{
                return SearchRotat(arra, si, mid-1, target);
            }
        }




    }
    public static void main(String args[]){

        // int arra[]={2,3,1,8,5,6};

        int arra[]={4,5,6,7,0,2,3};
        System.out.println(SearchRotat(arra, 0, arra.length-1, 0));
        // Quick(arra, 0, arra.length-1);
        // PrintArra(arra);



    }
}