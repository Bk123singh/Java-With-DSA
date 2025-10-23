public class backtraking {
    public static void ChangeArr(int arra[], int i, int val){
        if(i==arra.length){
            PrintArr(arra);
            return ;
        }

        arra[i]=val;
        ChangeArr(arra, i + 1, val+1);
        arra[i]=arra[i]-2;

    }

    public static void PrintArr(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i]+ " ");
        }
    }

    public static void Findsubset(String str, String ans ,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
           
            return;
        }

        Findsubset(str, ans+str.charAt(i), i+1);
        Findsubset(str, ans, i+1 );
    }

    public static void majorityEle(int arra[], int si, int ei){
        if(si>= ei){
            return;
        }

        int mid=si +(ei-si)/2;
        majorityEle(arra, si, mid);
        majorityEle(arra, mid, ei);

        finds(arra, si, mid, ei);
    }

    public static void finds(int arra[], int si, int mid ,int ei){
        int temp[]=new int[ei-si+1];

        int i=si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<ei) {
            if(arra[i]<arra[j]){
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
        while(j<=mid){
            temp[k++]=arra[j++];
        }

        for(k=0, i=si; k <=arra.length ;  k++, i++){
            arra[i]=temp[k];
        }
    }

    public static int  findsVal(int arra[], int si, int ei,int target){
        if(si>ei){
            return -1;
        }

        int mid=si + (ei - si)/2;

        if(arra[mid]==target){
            return mid;
        }

        if(arra[si]<=arra[mid]){
            if(arra[si]<=target && target <= arra[mid]){
                return findsVal(arra, si, mid-1, target);
            }else{
                return findsVal(arra, mid+1, ei, target);
            }
        }
        else{
            if(arra[mid] <= target && target <= arra[ei]){
                return  findsVal(arra, mid+1, ei, target);
            } else{
                return findsVal(arra, si, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        // int arra[]=new int[10];

        // ChangeArr(arra, 0, 1);
        // PrintArr(arra);
        // String str="abc";

        // Findsubset(str, " ", 0);
        // int arra[]={2,2,1,1,1,2,2};
        // majorityEle(arra, 0, arra.length-1);
        int arra[]={4,5,6,7,0,1,2};

        System.out.println(findsVal(arra, 0, arra.length-1, 7));
    
    }
}
 