

public class recustion {

    public static void Increase(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        Increase(n-1);
        System.out.println(n + " ");
        

    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*fnm1;
        return  fn;
    }

    public static int fabbonical(int n){
        if(n==0 || n==1){
            return n; 
        }

        int fnm1=fabbonical(n-1);
        int fnm2=fabbonical(n-2);
        int fn=fnm1+fnm2;
        return  fn;
    }


    public static int TotalSum(int n){
        if(n==1){
        return 1;
        }
        return n+TotalSum(n-1);
    }

    public static int FirstOccr(int arra[],int i, int key){
        if(i==arra.length){
           return -1;
        }
        if(arra[i]==key){
            return i;
        }

         return  FirstOccr(arra, i+1, key);

    }

    public static int lastOccr(int arra[], int key, int i){
        if(i== arra.length){
            return -1;
        }

        int Isfound=lastOccr(arra, key, i+1);


        if(Isfound==-1 && arra[i]==key){
            return i;
        }

        return Isfound;
    }


    public static int  Maxsum(int arra[]){
        int n=arra.length;
        //left 
         int leftmax[]=new int[n];
         leftmax[0]=arra[0];

         for(int i=1;i < n ; i++){
            leftmax[i]=Math.max(leftmax[i -1], arra[i]);
         }

         //right max

         int rightmax[]=new int[n];
         leftmax[n-1]=arra[n-1];
         for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], arra[i]);
         }


         int tappingWater=0;

         for(int i=0;i<n;i++){
            int Waterlevel=Math.min(leftmax[i], rightmax[i]);
            tappingWater+=Waterlevel-arra[i];
         }

         return tappingWater;
         
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

    public static int tallingProb(int n){

        if(n==0||n==1){
            return 1;
        }
        return tallingProb(n-1) + tallingProb(n-2);
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean  map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar=str.charAt(idx);

        if(map[currChar-'a']== true){
            removeDuplicate(str, idx +1, newStr, map);
        }else{
            map[currChar-'a']= true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }

    }

    public static void  AllOccur(int arra[], int key, int i){

        if(i==arra.length){
            
            return ;
        }

        

        if(arra[i]==key){
            System.out.print(i + " ");
        }
        AllOccur(arra, key, i+1);

    }

    public static void main(String[] args) {
        
        // Increase(5);
        // System.out.println(factorial(5));
        // System.out.println(fabbonical(5));

        // System.out.println("Total Sum : " + TotalSum(10));
        // int arra[]={8,3,6,9,5,10,2,5,3};

            // int arra[]={4,2,0,6,3,2,5};
            // int height[]={4,2,0,6,3,2,5};

        //     System.out.println(Maxsum(arra));
        //     System.out.println(TrappingWater(height));

        // // System.out.println(lastOccr(arra, 05, 0));

        // System.out.println("Way of talling : " + tallingProb(5));;

        // String str="appleaaa";
        // removeDuplicate(str, 0, new StringBuilder("") , new boolean[26] );

        int arra[]={3,2,4,5,6,2,7,2,2};

        AllOccur(arra, 2, 0);




    }
}
