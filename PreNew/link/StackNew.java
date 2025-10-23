import java.util.ArrayList;

public class StackNew{

    public static class Stack{
        ArrayList<Integer> list=new ArrayList<>();

        public boolean isEmpty(){
            return list.size()==0;
        }

        public void push(int data){
            list.add(data);
        }

        public int pop(){
            int top=list.get(list.size()-1);
           return list.remove(list.size()-1);
        }


        public int peek(){
            return list.get(list.size()-1);
        }
    }


    

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    public static class StackB{
        static Node head;
        
        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;

        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){

        StackB ss=new StackB();
        ss.push(10);
        ss.push(20);
        ss.push(30);
        ss.push(40);
        ss.pop();

        while (!ss.isEmpty()) {
            System.out.println(ss.peek());
            ss.pop();
        }
    }
}