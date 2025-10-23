import java.lang.*;
import java.util.*;

class other
{
    public static int findVal(int arra[] , int key){
        
        for(int i=0;i<arra.length;i++){
            if(arra[i]==key){
                return key;
            }
        }
        return -1;
        
    }
    

    public static int WaterTapping(int height[]){
        // left
        int leftMax[]=new int[height.length];
            leftMax[0]=height[0];

            for(int i=1;i<height.length;i++){
                leftMax[i]=Math.max(height[i], leftMax[i-1]);
            }


        // right maxamumValue

        int rightMax[]=new int[height.length];

        leftMax[height.length-1]= height[height.length-1];

        for(int i=height.length-2; i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        // tapping water 

        int tappingWater=0;

        for(int i=0; i<height.length;i++){
            int waterLevel=Math.min(leftMax[i], rightMax[i]);

            tappingWater+= waterLevel-height[i];
        }

       return tappingWater;


    }
	public static void main (String[] args) throws java.lang.Exception
	{
	
	// Scanner sc=new Scanner(System.in);	
	
    // int arra[]=new int[6];



    int height[]={4,2,0,6,3,2,5};

        System.out.println(WaterTapping(height));
    // System.out.println("enter the array value");
    
    // for(int i=0; i<arra.length;i++){
    //     arra[i]=sc.nextInt();
    // }
    
    // System.out.println("enter your key value");
    // int key=sc.nextInt();
    
    

    
    // int ans=findVal(arra, key);
    
    
    
    // if(ans==-1){
    //     System.out.println("No");
    // } else{
    //     System.out.println("YES");
    // }
    
    
	}
}
