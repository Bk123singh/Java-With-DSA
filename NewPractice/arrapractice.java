
import javax.management.loading.PrivateClassLoader;

public class arrapractice{

    public static boolean Duplicate(int arra[]){
        int lp=0;
        int rp=arra.length-1;
        while(lp<rp){
            if(arra[lp]==arra[rp]){
                return true;
            }
            if(arra[lp]<arra[rp]){
                lp=lp+1;
            }
            else{
                rp=rp-1;
            }
        }
        return  false;
    }

    public static  int FindVal(int arra[], int target){
       for (int i = 0; i < arra.length; i++) {

        if(arra[i]==target){
            return i;
        }
           
       }
       return -1;
        
    }

    public static void Buyandsell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i< prices.length;i++){
            if(buyprice < prices[i]){
                int profit=prices[i]-buyprice;
                maxProfit=Math.max(maxProfit, profit);
                
            } else{
                buyprice=prices[i];
            }
        }
        System.out.println("Maxprofit is: " +  maxProfit);
    }

    public static void TappingWater(int height[]){
        // left max

        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);

        }

        // right max

        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2; i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }


        int tappingWater=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);

            tappingWater=+waterlevel-height[i];
        }

        System.out.println("Total TappingWater is: " +  tappingWater);
    }
    public static void main(String[] args) {
        int arra[]={4,5,6,7,0,1,2};

        // System.out.println(FindVal(arra, 0));

        // int height[]={7,1,5,3,6,4};

        // Buyandsell(height);

        int height[]={4,2,0,6,3,2,5};
        
        TappingWater(arra);


    }
}