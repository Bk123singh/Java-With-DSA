
import java.util.Stack;

public class stack2 {
    public static void pushatBottom(Stack<Integer>list,int data){
        if(list.isEmpty()){
            list.push(data);
            return;
        }
        int top=list.pop();
        pushatBottom(list, data);
        list.push(top);
    }
    
    public static void main(String[] args) {
        Stack<Integer>list = new Stack<>();
        list.push(10);
        list.push(20);
        list.push(30);

    // while(!list.isEmpty()){
    //     System.out.print(list.peek() + " ");
    //     list.pop();
    //     }
        
        pushatBottom(list, 4);
        while(!list.empty()){
            System.out.println(list.pop());
        }


    }
}
