





public class practiceaaa{
    public static void sumArra(int arra[]){
        int sum=0;
        for (int i = 0; i < arra.length; i++) {
            sum+=arra[i];
        }
        System.out.println("result = " + sum);

    } 
    public static void findodd(int arra[]){
        for (int i = 0; i < arra.length; i++) {
            if(arra[i]%2!=0){
                System.out.println(arra[i]);
            }
        }
    } 

    public static int linearSearch(int arra[], int key){
        for(int i=0;i<arra.length;i++){
            if(arra[i]==key){ 
              return i;  
            }
        }
        return -1;
    }

    public static int bineary(int arra[], int key){
        int st=0;
        int en=arra.length-1;
        for(int i=0;i<=arra.length;i++){
            int mid=(st+en)/2;

            if(arra[mid]==key){
                return mid;
            }
            if(arra[mid]<key){
                st=mid+1;
            } else{
                en=mid-1;
            }
        }
        return -1;
    }

    public static void subarray(int arra[]){
        int tl=0;
        for(int i=0; i<arra.length;i++){
            for(int j=i+1; j<arra.length;j++){
                System.out.print("(" + arra[i] + "," + arra[j] + ")");
                tl++;
            }
            
        }
        System.out.println();
        System.out.println("total subarray: " + tl );
    }

    public static void maxSubArray(int arra[]){
        for(int i=0; i<arra.length;i++){
            int curr=arra[i];
            for(int j=0; j<arra.length;j++){
                int end=arra[j];
                for(int k=0; k<arra.length;k++){
                    System.out.println("("+ curr+ "," + end);
                }

            }
        }
    }

    public static void maxSum(int arra[]){
        int curr=0;
         int max=Integer.MIN_VALUE;
         for(int i=0; i<arra.length;i++){
            curr+=arra[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(curr, max);
         }
         System.out.println("Maximum sum is this array : " + max);
    } 
    public static int tappingWater(int arra[]){
        int n=arra.length;
        //left max calculate
        int leftHeight []= new int[n];
            leftHeight[0]= arra[0];
            for(int i=1; i<n;i++){
              leftHeight[i]=Math.max(arra[i], leftHeight[i-1]);
            }
         int rightmax [] = new int[n];
            rightmax[n-1] = arra[n-1];

            for(int i=n-2; i>=0 ; i--){
               rightmax[i] = Math.max(arra[i], rightmax[i+1]);

            }

            int tappingWater=0;
            for(int i=0; i<n; i++){
                int waterlevel= Math.min(leftHeight[i], rightmax[i]);
                tappingWater+=waterlevel-arra[i];
            }
            return tappingWater;
    }










    public static void tapping(int height[]){
        int n= height.length;
        int leftmax[]= new int[n];
        leftmax[0]= height[0];
        for(int i=1; i<n;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }

        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i =n-2; i>=0; i--){
            rightmax[i]= Math.max(height[i], rightmax[i+1]);
        }
        int tappingWater=0;
        for(int i=0; i<n;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            tappingWater+= waterlevel-height[i];
        }
        System.out.println(tappingWater);

    }

    public static int  buyandsell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0 ; i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit= prices[i] - buyprice;
                // maxprofit= Math.max(maxprofit, profit);
                System.out.println(profit);
            } else {
                System.out.println(0);
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }

    public static boolean pairsun1(int arra[], int target){
        int lp=0;
        int rp=arra.length-1;
        while(lp <rp){
            if(arra[lp]+ arra[rp]==target){
                return true;
            }
            if(arra[lp]+arra[rp] < target){
                lp++;
            } else{
                rp--;
            }
        }
        return false;

    }


    public static boolean pairsum2(int arra[], int key){
        int n=arra.length-1;
        int bp=-1;
        for(int i=0; i<arra.length;i++){
            if(arra[i]>arra[i+1]){
                 bp=i;
                 break;
            } 
        }
        int lp=bp+1;
        int rp=bp;

        while(lp!=rp){
            if(arra[lp]+arra[rp] ==key){
                return true;
            }
            if(arra[lp] + arra[rp] < key){
                lp=(lp+1)%n;
            }
            else{
                rp=(rp+n-1)%n;
            }
        }
        return false;


    }
    public static void main(String[] args) {
        int height[]={1,2,3,4,5,6};
        int arra[]= {11,15,6,7,8,9,10};
        int prices[]={7,1,5,3,6,4};
        // sumArra(arra);
        // findodd(arra);

        // int s= bineary(arra, 2);
        // if(s==-1){
        //     System.out.println("Key is not found");
        // } else{
        //     System.out.println("At index is : " + s);
        // }

        // subarray(arra);
        
        // maxSum(arra);

        // System.out.println("result: " + tappingWater(arra));
        // tapping(height);
        // System.out.println(" maxmimum profits : " + buyandsell(prices));
        System.out.println(pairsum2(arra, 16));


    }
    
}