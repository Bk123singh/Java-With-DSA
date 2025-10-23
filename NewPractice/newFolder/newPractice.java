







class newPractice {

    public static void Maxnum(int arra[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arra.length;i++){
         max=Math.max(arra[i],max);
        }
        System.out.println("maximum Number was : " + max);
    }

    public static int binearSearch(int arra[], int target){
        int si=0;
        int ei=arra.length-1;
         
        while(si <=ei){
            int mid=(si +ei)/2;

            if(arra[mid]== target){
                return mid;
            }
            
            else if(arra[mid] < target){
                si=mid+1;
            }else{
                ei=mid-1;
            }

        }
        return -1;
    }

    public static void TappingWater(int height[]){
        
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }

        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
    
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }


        int tappingWater=0;

        for(int i=0;i<height.length;i++){
        int width=Math.min(leftmax[i], rightmax[i]);

        tappingWater+= width-height[i];

        }
        System.out.println("Total tapping water is : " +    tappingWater);


    }

    public static int buysell(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<price.length;i++){
            if(buyprice <  price[i]){
                int profit=price[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }

    public static void bubblesort(int arra[]){
        for(int i=0;i<arra.length-1;i++){
            for(int j=0;j<arra.length-1-i;j++){
                if(arra[j] > arra[j+1]){
                    int temp=arra[j];
                    arra[j]=arra[j+1];
                    arra[j+1]=temp;
                }
            }
        }
    }

    public static void PrintArra(int arra[]){

        for(int i=0;i<arra.length;i++){
        System.out.print(arra[i]+ " ");
        }


    }

    public static void main(String[] args) {
        int arra[]={2,3,6,1,4,8,9,5,7};
        int height[]={4,2,0,6,3,2,5};
        int price[]={7,1,5,3,6,4};

        // System.out.println(buysell(price));
        // // TappingWater(height);

        bubblesort(arra);
        PrintArra(arra);
        
    }
}
