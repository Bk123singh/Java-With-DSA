
public class searching {


    public static int BinearySearch(int arra[], int key){
        int start=0; 
        int end=arra.length-1;

        while(start<=end){
            int mid=(start+end)/2;

            if(arra[mid]==key){
                return mid;
            }
            if(arra[mid]< key){
                start=mid+1;
            }
            if(arra[mid] > key){
                end=mid-1;
            }
            
        }
        return -1;
    }

    public static void ReverseArr(int num[]){
        int first=0;
        int last=num.length-1;
        while(first<=last){
            int temp=num[first];
            num[first]=num[last];
            num[last]=temp;
            first++;
            last--;
        }
    }


    // Printing the value in pair format

    public static void  pari(int arra[]){
        int total=0;
        for (int i = 0; i < arra.length; i++) {
            
            int curr=arra[i];
            for( int j=i+1;j<arra.length;j++){
                System.out.print("(" + curr+ "," + arra[j] + ")");
                total++;
            }
        }
        System.out.println("Total No of Pairs: " + total);
    }

    public static void PrintArr(int arra[]){
        for(int i=0; i<arra.length;i++){
            System.out.print(arra[i] +" ");
        }
        System.out.print(" ");
    }

    public static void SubPair(int arra[]){
        for(int i=0; i<arra.length;i++){
            int start=i;

            for(int j=i;j<arra.length;j++){
                int end=j;
            
                for(int k=start; k<=end;k++){
                    System.out.print(arra[k] + " ");
                }
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        System.out.print(" ");
    }

    public static void kadans(int arras[]){
        int curr=0; 
        int max=Integer.MIN_VALUE;
            
        for(int i=0;i<arras.length;i++){
            curr+=arras[i];
            if(curr<0){
                curr=0;
            }

            max=Math.max(max, curr);
        }

        System.out.println("Maxmun subArra is : " + max );
    }


    public static int TrappingWater(int height[]){

        //left max calcaltuing
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];

        for(int i=1; i<height.length;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }

        // right max calcaltuing 

        int rigthmax[]=new int[height.length];

        rigthmax[height.length-1]=height[height.length-1];

        for(int i=height.length-2; i>=0; i--){
            rigthmax[i]=Math.max(height[i], rigthmax[i+1]);
        }

        //loop

        int TrappedWater=0;

        for(int i=0; i<height.length;i++){
            int waterlevel=Math.min(leftmax[i], rigthmax[i]);

            TrappedWater+=waterlevel-height[i];
        }

        return  TrappedWater;

    }

    public static int sellAndBuy(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0; i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit=prices[i]-buyPrice;
                maxprofit=Math.max(maxprofit, profit);
            }else{

                buyPrice=prices[i];
            }
        }
        return maxprofit;
    }
    
    public static void main(String args[]){

        int arra[]={1,2,3,4};
        int num[]={2,4,6,8,10};

        int arras[]={-2,-3,4,-1,-2,1,5,-3};

        int height[]={4,2,0,6,3,2,5};

        int prices[]={7,1,5,3,6,4};

        // System.out.println("ans is here at index of : " + BinearySearch(arra, 12));

        // ReverseArr(num);
         
        // System.out.println("reverse all Array element");
        // for (int i = 0; i < num.length; i++) {
        //     System.out.print(num[i] + " ");
        // }
        

        // SubPair(arra);
        // PrintArr(arra);

        // kadans(arras);

        System.out.println("Total trapping water is: " +TrappingWater(height));

        // System.out.println("profit is: " +  sellAndBuy(prices));
    }
    
}
