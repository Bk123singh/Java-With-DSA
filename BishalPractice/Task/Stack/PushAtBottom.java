
import java.util.Stack;

public class PushAtBottom {

    public static void PushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushAtBottom(s, data);
        s.push(top);
    }

    public static void reverse(Stack<Character> s, String str){
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }

    }
    public static void main(String args[]){
        Stack<Character>s=new Stack<>();
        // Stack<Integer> s=new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // PushAtBottom(s,4);

        reverse(s, "ABC");


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}