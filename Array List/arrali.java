import java.util.*;

public class arrali {


    public static void main(String[] args) {
       ArrayList<Integer>list = new ArrayList<>(); 
       list.add(10);
       list.add(20);
       list.add(3);
       list.add(40);
       list.add(50);
       list.add(60);
       System.out.println(list);
       Collections.sort(list);
       System.out.println(list);
       Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        list.add(70);
        System.out.println(list);
    }
      
}