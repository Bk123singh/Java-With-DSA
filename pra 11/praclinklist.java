
public class praclinklist{
    public class Node{
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
    public void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head= tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }

    public int  removefirst(){
        if(head==null){
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;
            
        }
        else if (size==1){
            int val=head.data;
            head= tail= null;
            size=0;
            return val;   
        }
        int val = head.data;
        head= head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println( "ll is enoty");
            return Integer.MIN_VALUE;

        } else if(size ==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // prev i=suze-2;
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int  val = prev.next.data;
        prev.next=null;
        tail = prev;
        size--;
        return val;


    }
    public int  istertative(int key){
        Node temp=head;
        int i = 0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;


        }
        return -1;

    }
    public static void main(String[] args) {
        praclinklist ll= new praclinklist();
       ll.addfirst(10);
       ll.addlast(20);
       ll.addlast(30);
       ll.addlast(40);
       ll.addlast(50);
       ll.removefirst();
       ll.removelast();
      System.out.println( ll.istertative(30));
       
    }
}