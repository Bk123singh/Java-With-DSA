public class findDuplicate{

        public static boolean findDublicate(int arra[]){
            int lp=0;
            int rp=arra.length-1;
            while(lp<rp){
                if(arra[lp] == arra[rp]){
                    return true;
                }
                if(arra[lp] < arra[rp]){
                    lp=lp+1;
                }else{
                    rp=rp-1;
                }
            }
            return false;
        }
        public static int pairsum2(int nums[], int target){
            int bp=-1;
            int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[i+1]){
                bp=i;
                break;
            }
        }
        int rp=bp;
        int lp=bp+1;
        int i=0;
        while(lp!=rp){
            if(nums[lp] == target || nums[rp] ==target){
                return i;
            }
             else if(nums[lp] <target || nums[rp] < target){
                 lp=(lp+1)%n;
             } else if(nums[lp]> target || nums[rp] > target){
                rp=(n+rp-1)%n;
             }
             i++;
        }
        return -1;
    }

        public static int buyandsells(int prices[]){
            int maxprofit=0;
            int buysell=Integer.MAX_VALUE;
           for(int i=0; i<prices.length;i++){
            if(buysell<prices[i]){
                int profit=prices[i]-buysell; 
                maxprofit=Math.max(profit, maxprofit);
            } 
            else {
                buysell=prices[i];
            }
           }
           return maxprofit;
        }
    
        public static void main(String args []){
            int arra[]={1,2,3,5};
    
            // System.out.println(findDublicate(arra));

             int nums[] = {4,5,6,7,0,1,2};
            int  target = 3;

           int prices[]={ 7,1,5,3,6,4};

           System.out.println(buyandsells(prices));
            


    
        }
    }