class newfile {
    public static  boolean containsDuplicate(int[] nums) {
        
        for(int i=0; i<nums.length-1;i++){
            int k=nums[i];
            for(int j = i+1; j<nums.length;j++ ){
            if(nums[j]== k){
                return true;
            }
        }
        }
        return false;  
    }
 public static void main(String [] args){
    
    int nums[] = {1,2,3,1};
    containsDuplicate(nums);

    
 }
}