public class kadan {
    public static void kadans(int arra[]){
        int curr=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arra.length;i++){
            curr= curr + arra[i];
            if(curr<0){
                curr=0;
            }
            maxSum= Math.max(curr, maxSum);
        }
        System.out.println(maxSum);
    }
    public static int buysell(int prices[]){
    int buyprice=Integer.MAX_VALUE;
    int maxprofit=0;
    for(int i=0; i<prices.length;i++){
        if(buyprice < prices[i]){
            int profit=prices[i]-buyprice;
            maxprofit= Math.max(profit, maxprofit);
    
        }else{
        buyprice= prices[i];
    }
}
return maxprofit;

}
    public static void main(String[] args) {
        int arra[]={-2,-3,4,-1,-2,1,5,-3};
        int prices[]= {7,1,5,3,6,4};
        // kadans(arra);
        buysell(prices);
    }

}