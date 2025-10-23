
import java.util.Stack;

public class other{
    public static void pushAtBotom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtBotom(s, data);
        s.push(top);
    }

    //reverse a String using a stack

    public static String reverseString(String str){
        Stack<Character> s= new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
            
        }
       StringBuilder  result=  new StringBuilder(" ");
       while(!s.isEmpty()){
        char curr=s.pop();
        result.append(curr);
       }
       return result.toString();
    }

    // reverse a stack

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top= s.pop();
        reverse(s);
        pushAtBotom(s, top);

    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }

    public static void main(String[] args) {
        Stack<Integer> s=  new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);
        printStack(s);
        // String str = "bishal";
        // String si= reverseString(str);
        // System.out.println(si);
    }
}