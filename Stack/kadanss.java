
import java.math.MathContext;
import java.time.chrono.MinguoChronology;
import java.util.stream.Stream;

public class kadanss {
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


public static int  tappingwater(int height[]){
    int n = height.length;
    int leftmax[] = new int[n];
        leftmax[0]=height[0];
        for(int i=1; i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
        }


    int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i]=Math.max(rightmax[i+1], height[i]);
        }

        int tappingwater=0;
        for(int i=0; i<n;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            tappingwater+=waterlevel-height[i];
        }
        return tappingwater;

}


public static void buyy(int prices[]){
    int buyprice=Integer.MAX_VALUE;
    int maxprofit=0;
    for(int i=0;i<prices.length;i++){
        if(buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            maxprofit=Math.max(maxprofit,profit );
        } else{
            buyprice=prices[i];
            
        }
    }
    System.out.println(maxprofit);
}

public static boolean checkpallindrom(String str){
    for(int i=0; i<str.length()/2;i++){
        int n=str.length();
        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }
    }
    return true;

}




public static boolean pali(String str){
    int n=str.length();
    for(int i=0; i < str.length()/2;i++){
         if(str.charAt(i)!= str.charAt(n-i-1)){
            return false;
         }
    }
    return true;
}


public static void   findlargesr(String  fruit[]){
    String largest=fruit[0];
    for(int i=0; i<fruit.length;i++){
        if(largest.compareTo(fruit[i])<0){
            largest=fruit[i];
        }
    }
    System.out.println(largest);

}

public static double  findpath(String strs){
    int x=0,y=0;
    for(int i=0; i< strs.length();i++){
        char dir= strs.charAt(i);
        if(dir=='S'){
            y--;
        } else if(dir=='N'){
            y++;
        } else if(dir=='E'){
            x++;
        }else if(dir=='W'){
            x--;
        }
        
    }
    int x2=x*x;
    int y2=y*y;
    double path=Math.sqrt(x2+y2);
    return path;
}  
    public static void main(String[] args) {
        // // int arra[]={-2,-3,4,-1,-2,1,5,-3};
        // int prices[]= {7,1,5,3,6,4};
        // int height[]={4,2,0,6,3,2,5};
        // // System.out.println(tappingwater(height));
        // // // kadans(arra);
        // // System.out.println(buysell(prices));

        // // buyy(prices);
        String  strs="WNEENESENNN";

        String fruit[] = {"apple", "mango" , "banana"};
        String  str= "racecar" ;

        // System.out.println(pali(str));
        // findlargesr(fruit);
        // System.out.println(findpath(strs));

        StringBuilder sb = new StringBuilder(" ");
        for(char  ch= 'a'; ch<='z'; ch++){
            sb.append(ch);
            
        }
        System.out.println(sb +" ");
       
    
    

}
}