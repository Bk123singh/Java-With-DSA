import java.util.ArrayList;

public class stat{
    public static class stack{
        static ArrayList<Integer>list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            return list.get(list.size()-1);
        }
    }




    public static void main(String[] args) {
        stack s = new stack();

        s.push(10);
        s.push(20);
        s.push(30);


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}