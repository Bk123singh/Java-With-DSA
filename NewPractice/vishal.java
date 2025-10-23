public class vishal{
    public static void TappingWater(int arra[]){
        //left max
        int leftmax[]=new int[arra.length];
         leftmax[0]=arra[0];
        for(int i=1; i<arra.length;i++){
            leftmax[i]=Math.max(leftmax[i-1], arra[i]);
        }

        // right max
        int rightmax[]=new int[arra.length];

         rightmax[arra.length-1]=arra[arra.length-1];
         for(int i=arra.length-2; i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], arra[i]);
         }

         int tappingWater=0;
         for(int i=0; i<arra.length;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            tappingWater+=waterlevel-arra[i];
         }
        
         System.out.println("Total tapping water is : " + tappingWater);
    }

    public static void buyAndSell(int price[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;

        for(int i=0; i<price.length;i++){
            if(buyprice <  price[i]){
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=price[i];
            }
        }
        System.out.println("maxProfit is : " + maxprofit);
    }
    
    public static boolean twoSumPro(int arra[], int target){
        int lp=0; 
        int rp=arra.length-1;

        while (lp<=rp) {
            if(arra[lp] + arra[rp]==target){
                return true;
            }
            if(arra[lp] + arra[rp] < target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }

    public static void BubbleSort(int arra[]){
        for(int i=0; i<arra.length;i++){
            for(int j=0; j< arra.length-1-i;j++){
                if(arra[j]>arra[j+1]){
                int temp=arra[j];
                arra[j]=arra[j+1];
                arra[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int arra[]){
        for(int i=0; i<arra.length;i++){
            int minPos=i;
        for(int j=0;j<arra.length;j++){
            if(arra[minPos]< arra[j]){ 
            minPos=j;
            int temp=arra[minPos];
            arra[minPos]=arra[i];
            arra[i]=temp;
        }
        }
        }
    }
    
    public static void PrintArra(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arra[]={4,2,0,6,3,2,5};
        // int arra[]={2,4,6,8,10,12,14};
        int price[]={7,1,5,3,6,4};
        // buyAndSell(price);

        // // TappingWater(arra);
        // System.out.println(twoSumPro(arra, 8));
        BubbleSort(arra);
        PrintArra(arra);
        System.out.println();
        selectionSort(arra);
        PrintArra(arra);
    }
}