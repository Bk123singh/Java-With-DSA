import java.util.ArrayList;

public class prractice {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
        this.data=data;
        this.next=null;
        }
    }
public static Node head;
public static Node tail;
public void addfirst(int data){{
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}
}

public void printll(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+ "->");
        temp=temp.next;
    }
    System.out.println("null");

} 
public void addlast(int data){
    Node newNode= new Node(data);
    if(head==null){
        head=tail=null;
        return;
    }
    tail.next=newNode;
    tail=newNode;

}

public  static class stack{
    static  ArrayList<Integer>list=new ArrayList<>();

    public static boolean isEmpty(){
        return list.size()==0; 
    }

    public static void push(int data){
        list.add(data);

    }

    public static int pop(){
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public static int peek(){
         return list.get(list.size()-1);

    }

}




    public static void main(String args []){

        // prractice ll=new prractice();
        // ll.addfirst(30);
        // ll.addfirst(20);
        // ll.addfirst(10);
        // ll.addlast(40);
        // ll.addlast(50);
        // ll.printll();
    stack s= new stack();

    s.push(10);
    s.push(20);
    s.push(30);

    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }



    }
}