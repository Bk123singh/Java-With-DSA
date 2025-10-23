public class qustion1{

    public static void distance(String path){
        int count=0;

        

        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='U'){
                count++;
            }else{
                count--;
            }
        }
        System.out.println("total distance is : " + count );
    }


    // public int trap(int[] arra) {
    //     int n=arra.length;
    //     int left[]=new int[n];

    //     left[0]=arra[0];
    //     for(int i=1;i<arra.length;i++){
    //         left[i]=Math.max(arra[i], left[i+1]);
    //     }

    //     int rightmax[]=new int[n];
    //     rightmax[n-1]=arra[n-1];
    //     for(int i=n-2;i>=0;i--){
    //         rightmax[i]=Math.max(arra[i], rightMax[i-1]);
    //     }

    //     int tappingWat=0;

    //     for(int i=0;i<arra.length;i++){
    //         waterLevel=Math.min(left[i], rightmax[i]);
    //         tappingWat+=waterLevel-arra[i];
    //     }




    // } 

    public  static int trap(int[] arra) {
        int n=arra.length;
        int left[]=new int[n];

        left[0]=arra[0];
        for(int i=1;i<arra.length;i++){
            left[i]=Math.max(arra[i], left[i-1]);
        }

        int rightmax[]=new int[n];
        rightmax[n-1]=arra[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arra[i], rightmax[i+1]);
        }

        int tappingWat=0;

        for(int i=0;i<arra.length;i++){
          int  waterLevel=Math.min(left[i], rightmax[i]);
            tappingWat+=waterLevel-arra[i];
        }


        return tappingWat;

    }
    public static void main(String args[]){
        // String path="DDUUUUDDUU";

        // distance(path);

        int arra[]={0,1,0,2,1,0,1,3,2,1,2,1};
        // int arra[]={4,2,0,3,2,5};
        System.out.println(trap(arra));


    }
}