public class Stacks {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class StackA{
        static Node head;

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node newNode=new Node(data);

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

    public static void main(String[] args) {

        StackA b=new StackA();
        b.push(10);
        b.push(20);
        b.push(30);
        b.push(40);
        b.push(50);
        b.pop();
        
        
        while (!b.isEmpty()) {
            System.out.println(b.peek());
            b.pop();
        }
    }
}