
import java.util.ArrayList;

public class Queuee {

    public static class Node{
        int data;
         Node next; 
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    

    public static void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public static int remove(){
        if(size==0){
            System.out.println("ll is empty");
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;

    }

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->" );
            temp=temp.next;
        }
        System.out.println("null");

    }
    public static class statick{
         static ArrayList<Integer>list=new ArrayList<>();

         public boolean isEmpty(){
            return list.size()==0;
         }

         public void push(int data){
            list.add(data);
         }

         public int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

         } 
         public static int peek(){
             return list.get(list.size()-1);
        
         }
    }





    public static class stack{
        static Node head;

        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode= new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }



    public static void main(String[] args) {
        
       
        
    }
}