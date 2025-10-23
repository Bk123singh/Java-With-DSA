
import java.awt.PrintGraphics;



public class Divide {

    public static void mergeShort(int arra[], int si, int ei){
        if(si>=ei){
            return;
        }

       

        int mid = si + (ei - si)/2;
        mergeShort(arra, si, mid);
        mergeShort(arra, mid + 1, ei);
        merge(arra, si, mid, ei);
    }

    public static void merge(int arra[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid  && j <=ei) {
            if(arra[i]<arra[j]){
                temp[k]=arra[i];
                i++;
               
            } else{
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

        for( k=0, i=si; k<temp.length;k++, i++){
            arra[i]=temp[k];
        }
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


    public static int Search(int arra[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }

        // kaam
        int mid=si+ (ei-si)/2;

        if(arra[mid]==target){
            return mid;
        }
        //case 1 at line one
        if(arra[si]<=arra[mid]){
            //case a: left part
            if(arra[si]<=target && target<= arra[mid]){
                return  Search(arra, target, si,mid-1);

            
            }else{              //case b right part

                return Search(arra, target, mid+1, ei);
            }

        }else{
            if(arra[mid]<=target && target <= arra[ei]){
                return  Search(arra, target,mid+1, ei);
            }else{
                return Search(arra, target, si, mid-1);
            }



        }
    }

    public static void StrMerge(String str[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid=si + (ei-si)/2;

        StrMerge(str, si, mid);
        StrMerge(str, mid+1, ei);
        strmerge(str, si, mid, ei);

       
    }

    public static void strmerge(String str[], int si, int mid, int ei){
        String temp[]=new String[ei-si +1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid  && j <=ei) {
            if(str[i].compareTo(str[j]) < 0 ){
                temp[k]=str[i];
                i++;
               
            } else{
                temp[k]=str[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=str[i++];
        }

        while(j<=ei){
            temp[k++]=str[j++];
        }

        for( k=0, i=si; k<temp.length;k++, i++){
            str[i]=temp[k];
        }
    }

    public static void PrintArr(int arra[]){
        for(int i=0; i<arra.length;i++){
            System.out.print(arra[i]+ " ");
        }
        System.out.print(" ");
    }


    public static void mergeSHort(int arra[], int si, int ei){
        if(si >= ei){
            return;
        }

        int mid=si +(ei-si)/2;
        mergeSHort(arra, si, mid);
        mergeSHort(arra, mid+1, ei); 
        merges(arra, si, mid, ei);

    
    }

    public static void merges(int arra[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid  && j <=ei) {
            if(arra[i]<arra[j]){
                temp[k]=arra[i];
                i++;
               
            } else{
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

        for( k=0, i=si; k<temp.length;k++, i++){
            arra[i]=temp[k];
        }
    }

    // public static void Findsubset(int arra[], int temp[],int i){
        

    //     if(i== arra.length){
    //         System.out.println(arra[i] + " ");
    //         return;
    //     }
    //     int ans[]=new int[arra.length];
    //      ans[i]=temp[i]+arra[i];

    //     Findsubset(arra ,ans, i+1);
    //     Findsubset(arra, temp,  i+1);

    // }

    public static void findsubset(String str, String ans,int i ){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }

        findsubset(str, ans+str.charAt(i), i+1);
        findsubset(str, ans, i+1);
    }

    // permutations 

   
    public static void main(String args []){
        // int arra[]={6,3,9,5,2,8};

        // mergeSHort(arra, 0, arra.length);
        // PrintArr(arra);
       
    //    QuickSort(arra, 0, arra.length-1);
    // //     mergeShort(arra, 0, arra.length-1);
    //    PrintArr(arra);

    // int arra[]={4,5,6,7,0,1,2};
    // int target=4;

    // int idx=Search(arra, target, 0, arra.length-1);

    // System.out.println("Find the value at index of: " + idx);

    // String str[]={"sun", "earth", "mars", "memory"};

    //     StrMerge(str, 0, str.length-1);
    //     PrintArr(str);
    // int arra[]={1,2,3};
    // Findsubset(arra,new int[arra.length], 0);

    // String str="ABC";
    // findsubset(str, " ", 0);
}
}
