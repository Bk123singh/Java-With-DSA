import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
public class wenArray {

    public static void TwoSum(int arra[], int target){
        Arrays.sort(arra);

        int lp=0;
        int rp=arra.length-1;
        while(lp<rp){
            if(arra[lp] + arra[rp]==target){
                System.out.println(lp + "," + rp);
            }
            if(arra[lp]+arra[rp]< target){
                lp=lp+1;
            }else{
                rp=rp-1;
            }
        }
    }
    

    // public static int  removeEle(int arra[], int val){
    //     int k=0;
    //     for(int i=0; i<arra.length;i++){
    //         if(arra[i]!=val){
    //             arra[k]=arra[i];
    //             k++;
    //         }else{
    //             arra[]
    //         }
    //     }
    //     return k;
        
         
    // }

    public static int RotatedELe(int arra[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;

        if(arra[mid]==target){
            return mid;
        }

        if(arra[si]<=arra[mid]){
            if(arra[si]<=target && target <=arra[mid]){
                return RotatedELe(arra, target, si, mid-1);
            }else{
                return RotatedELe(arra, target, mid+1, ei);
            }
        }else{
            if(arra[mid]<= target && target<=arra[ei]){
                return RotatedELe(arra, target, mid=+1, ei);
            }else{
                return RotatedELe(arra, target, si, mid-1);
            }
        }
        
        

    }
    public static void PrintArr(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
    }
    public static void main(String[] args) {
        // int arra[]={3,4,9,6,4};
        // TwoSum(arra, 8);

        // removeEle(arra, 4);
        // PrintArr(arra);

        int arra[]={4,5,6,7,0,1,2};
        System.out.println(RotatedELe(arra, 0, 0,arra.length-1));
    }
}