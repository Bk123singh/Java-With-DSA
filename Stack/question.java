// reverse a staring using a stack

import java.util.*;
public class question {
    public static String  reverseString(String str){
        Stack<Character>s= new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr=s.pop();
            res.append(curr);
        }
        return res.toString();
    }
    public static void pushatBottom(Stack<Integer>list,int data){
        if(list.isEmpty()){
            list.push(data);
            return;
        }
        int top=list.pop();
        pushatBottom(list, data);
        list.push(top);
    }

    // reverse a stack
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushatBottom(s, top);
    }
    public static void printStack(Stack<Integer>s){
       while (!s.isEmpty()){
        System.out.println(s.pop());
       } 
    }

    public static void main(String[] args) {
        Stack<Integer>s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushatBottom(s, 4);
        printStack(s);
         //  String str = "ABC";
        //  String srr = reverseString(str);
        //  System.out.println(srr);
        

    }
}