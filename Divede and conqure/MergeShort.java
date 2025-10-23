public class MergeShort {
    public static void print(int arra[]){
        for(int i=0;i<arra.length; i++){
            System.out.print(arra[i] + " ");

        }
    }
    public static void mergeSh(int arra[], int si, int en ){
        if(si>=en){
            return;
        }
    
    //kaam
    int mid = si + (en - si)/2;
    mergeSh(arra, si, mid);
    mergeSh(arra, mid + 1, en);
    merge(arra, si, mid, en);

    }

    // merge method to merge the sorted parts
    public static void merge(int arra[], int si, int mid, int en){
        int temp[] = new int[en - si +1];
        int i= si; // idx for 1st short part 
        int j = mid +1 ; // idx for 2nd sorted part
            int k = 0; // idx for temp;
        while(i<=mid && j <=en){
            if(arra[i] < arra[j]){
                temp[k] = arra[i];
                i++;
            } else{
                temp[k] = arra[j];
                j++;
            }
            k++;

        }
        // for leftover elements of 1st sorted part
        while(i<=mid){
            temp[k++] = arra[i++];
        }

        // for leftover enements of 2nd sorted part
        while(j<= en){
            temp[k++] = arra[j++];
        }
        //copy temp to original array
        for( k=0, i = si; k< temp.length;k++,i++){
            arra[i] = temp[k];

        }

    } 

    public static void main(String[] args) {
        int arra[]={6,3,9,5,2,8};
        mergeSh(arra, 0, arra.length-1);
        print(arra);
    }
}