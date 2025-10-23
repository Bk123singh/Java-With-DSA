
import java.util.ArrayList;

public class arraylist11{
    public static void swap(ArrayList<Integer>list, int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // System.out.println(list);
        // list.remove(2);
        // System.out.println(list);
        
        // System.out.println(list.get(2));
        // list.set(2, 50);
        // System.out.println(list);
        // System.out.println(list.contains(10));
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     if(max< list.get(i)){
        //         max=list.get(i);
        //     }
        // }
        // System.out.println(max);
        swap(list, 0, 3);
        System.out.println(list);
    }
}