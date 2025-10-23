

public class linklist {

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
    public static int size;

    public void add(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        
        head=newNode;



    }

    public void addlast(int data){
        Node newNode =new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;

    }
    
    public int removefirst(){
        if(size==0){
        head=tail=null;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public void  reversll(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!= null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    

    public Node midNode(){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }


    public boolean  checkpali(){
        Node mid=midNode();

        if(head==null && head.next==null){
            return true;
        }

        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right !=null){
            if(right.data!= left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public void Printll(){
        if(size==0){
            System.out.print("LL is empty");
            return;
        }

        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    
    }

    // public void reverse(){
    //     Node prev=null;
    //     Node curr=tail=head;
    //     Node next;

    //     while(curr !=null){
    //        next=curr.next;
    //        curr.next=prev;
    //        prev=curr;
    //        curr=next;
    //     }
    //     head=prev;
    // }
   public static void main(String args[]){

    linklist ll=new linklist();
   ll.add(30);
   ll.add(20);
   ll.add(10);
   ll.addlast(20);
   ll.addlast(10);
   ll.Printll();
   System.out.println(ll.checkpali());
   } 
}
