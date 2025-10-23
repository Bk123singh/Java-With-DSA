









public class newBish {

    public static  void findLargest(int arra[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<arra.length;i++){
            Largest=Math.max(arra[i], Largest);
        
        }

        System.out.println(Largest);
    }

    public static int binearySearch(int arra[], int target){
        
        int si=0; 
        int ei=arra.length-1;
        int mid = si+(ei-si);

        while(si<=ei){
            if(arra[mid]==target){
                return mid;
            }
            if(arra[mid] < target){
                si=mid+1;
            }else{
                ei=mid-1;
            }
        }
        return -1;
    }

    public static void reverseArra(int arra[]){
        int first=0;
        int last=arra.length-1;

        while (first<=last) {
           int temp=arra[first];
            arra[first]=arra[last];
            arra[last]=temp;
            first++;
            last--;
        }
    }

    public static  void printArra(int arra[]){
        for(int i=0; i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
    }

    public static void pair(int arra[]){
        for(int i=0; i<arra.length;i++){
            int curr=arra[i];
            for(int j=i+1;j<arra.length;j++){
                System.out.print("(" + curr + "," + arra[j]+ ")");
            }
        }
    }


    public static void subPair(int arra[]){
        for(int i=0; i<arra.length;i++){
            int st=i;
            for(int j=i; i<arra.length;j++){
                int ei=j;
                for(int k=st; k<=ei; k++){
                    System.out.print(arra[k] + " ");
                }
                System.out.print(" ");

            }
            System.out.print(" ");
        }
    }

    public static void Kadans(int arras[]){
        int curr=0; 
        int  max=Integer.MIN_VALUE;

        for(int i=0; i<arras.length;i++){
            curr+=arras[i];
            if( curr<0){
                curr=0;
            }
            max=Math.max(max, curr);

        }
        System.out.println(max);
    }

    public static void TappingWater(int arra[]){
        //left max

        int leftmax[]=new int[arra.length];
        leftmax[0]=arra[0];
        for(int i=1; i<arra.length;i++){
            leftmax[i]=Math.max(arra[i], leftmax[i-1]);
        }

        // right max

        int rightmax[]=new int[arra.length];
        rightmax[0]=arra[arra.length-1];
        for(int i=arra.length-2; i>=0;i--){
            rightmax[i]=Math.max(arra[i], rightmax[i+1]);
        }

        int totalwater=0;

        for(int i=0; i<arra.length;i++){
            int waterlevel=Math.min(rightmax[i], leftmax[i]);

            totalwater+=waterlevel-arra[i];
        }
        System.out.println("Total water is: " +  totalwater);

    }
    public static int BuyAndSell(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<price.length;i++){
            if(buyPrice<price[i]){
                int profit=price[i]-buyPrice;

                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyPrice=price[i];
            }
        }
        return maxprofit;
    }
    public static void removeElemetn(int arra[], int val){
        int k=0;
        for(int i=0;i<arra.length;i++){
            if(arra[i]!=val){
                arra[k]=arra[i];
                k++;
            }
        }
        for(int i=0; i<arra.length;i++){
            System.out.print(arra[i] + " ");
        }
        
    }

    public static void MergeTwoArra(int num1[], int num2[]){
        int temp[]=new  int[num2.length + num1.length];
        int k=num1.length;

        for(int i=0; i<num1.length;i++){
            temp[i]=num1[i];
        }
            
       
        
        for(int j=k,  i=0; j<temp.length;j++, i++){
            temp[k]=num2[i];
       
    
}

        for(int i=0; i<temp.length;i++){
            System.out.print(temp[i] + " ");
        }
    }


    public static void KadansAlgo(int arra[]){
        int max=Integer.MIN_VALUE;
        int curr=0;

        for(int i=0; i<arra.length;i++){
            curr=arra[i];
            if(curr <0){
                curr=0;
            }
            max=Math.max(max, curr);
        }
        System.out.println(max);

    }
    public static void main(String args[]){
        // int arra[]={2,4,6,8,10};
        int arra[]={-2,-3,4,-1,-2,1,5,-1};
        // reverseArra(arra);
        // // printArra(arra);
        // // pair(arra);
        // subPair(arra);
        // // Kadans(arras);
        // int arra[]={4,2,0,6,3,2,5};
        // TappingWater(arra);
        
        // int price[]={7,1,5,3,6,4};
        // System.out.println(BuyAndSell(price));

        // int arra[]={1,2,3,2,4,2,5};
        // removeElemetn(arra, 2);

        // int num1[]={1,2,3};
        // int nums2[]={4,5,6};
        // MergeTwoArra(num1, nums2);

        KadansAlgo(arra);
        
        
    }
}