import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void Swap(ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
        System.out.println(list);

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(1);
        System.out.println(list);
        // assending 
        Collections.sort(list);
        System.out.println(list);
        // decentage oder

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        list.add(10);
        list.add(2);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());
        

        

    }
}