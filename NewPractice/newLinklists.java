import java.util.LinkedList;

public class newLinklists{
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

    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }

        head=head.next;
    }

    public void printLL(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }

        
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
  
    public static void main(String[] args) {

        newLinkList ll=new newLinkList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(20);
        ll.addfirst(10);

        ll.prinlLL();

        
    }
}