public class singlylinklist {

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
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        
    }

    public void printll(){
        Node temp=head; 
         while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
         }
        
         System.out.println("null");
    }
    public void print(){ 
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args []){
        singlylinklist ll = new singlylinklist();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.print();
    }
}