
import java.util.ArrayList;



public class arralistr {
    public static void Swapnumber(ArrayList<Integer>list, int idx1, int idx2 ){
        for(int i=0; i<=idx2; i++){
            if(idx1== i){
                int temp=list.get(idx2);
                list.set(idx2, list.get(idx1));
                list.set(idx1, temp);
                
            }
        }
    System.out.println(list);

    }


    public static void mostContainWater(ArrayList <Integer> list){
        int maxWater=0;
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            int ht=Math.min(list.get(rp), list.get(lp));
            int width=rp-lp;
            int currwater=ht*width;
            maxWater=Math.max(maxWater, currwater);
            if(list.get(lp)< list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        System.out.println("Maximum water containing is : " + maxWater);
        

    }

    public static void Mostwater(ArrayList<Integer>list){
        int maxwater=0;
        for(int i=0; i<list.size();i++){
            for(int j=i+1;j< list.size();j++){
                int ht=Math.min(list.get(i),  list.get(j));
                int width=j-1;
                int currwater=ht*width;

                maxwater=Math.max(maxwater, currwater);
            }
           
        }
        System.out.println(maxwater);
    }

    public static boolean  TargetSum(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp) + list.get(rp)< target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }


    public static void main(String args[]){

        ArrayList <ArrayList <Integer>> mainlist=new ArrayList<>();
        ArrayList <Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // list.add(1);
        // list.add(8);
        // list.add(6);
        // list.add(2);
        // list.add(5);
        // list.add(4);
        // list.add(8);
        // list.add(3);
        // list.add(7);
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add((40));
        // list.add(50);

        // list1.add(1);
        // list1.add(2);
        // list1.add(3);
        // list1.add(4);
        // list1.add(5);
        // mainlist.add(list);
        // mainlist.add(list1);
        // // System.out.println(mainlist);

        // for(int i=0;i<mainlist.size();i++){
        //     ArrayList <Integer> currlist=mainlist.get(i);
        //     for(int j=0; j<currlist.size();j++){
        //         System.out.print(list.get(j ) + " ");
        //     }
        // }

        // mostContainWater(list);

        // Mostwater(list);

        System.out.println(TargetSum(list, 5));
       
       
    }
}