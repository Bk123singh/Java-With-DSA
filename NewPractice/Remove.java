public class Remove {

    public static int RemoveEle(int arra[], int element){

       int k=0;
       for(int i=0; i<arra.length;i++){
        if(arra[i]!= element){
            arra[k]=arra[i];
            k++;
        }
       }
       return k;
    }

    public static int TappingWater(int height[]){

        // left 

        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];

        for(int i=1; i<height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

        // left

        int Rightmax[]=new int[height.length];

        leftMax[height.length-1]=height[height.length-1];

        for(int i=height.length-2; i>=0;i--){
            Rightmax[i]=Math.max(height[i], Rightmax[i+1]);
        }



        int TappingWater=0;

        for(int i=0; i<height.length;i++){
            int waterLevel=Math.min(leftMax[i], Rightmax[i]);

            TappingWater += waterLevel-height[i];
        }

        return TappingWater;
    }

    public static void TwoSum(int arra[], int target){
        for(int i=0;i<arra.length;i++){
            int curr=arra[i];
            for(int j=i+1; i<arra.length;j++){
                if(curr + arra[i]==target){
                    System.out.println(i+ " " + j);
                }
            }
        }
        System.out.println("not found the value");
    }



    public static void main(String args[]){
        int arra[]={3,4,9,6,4};


        int height[]={4,2,0,6,3,2,5};

        // RemoveEle(arra, 3);

        // for (int i = 0; i < arra.length; i++) {
            
        //     System.out.print(arra[i]+" ");
        // }

        TwoSum(arra, 8);



    }
}
