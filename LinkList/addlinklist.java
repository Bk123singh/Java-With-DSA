
// add first and add last
public class addlinklist {
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
// add first in linklist

    public void addfirst(int data){
        //steps1 = create new node
        Node newNode= new Node(data);
        size++ ;
        if(head == null){
            head = tail =newNode;
            return;
        }

        // steps2 = newNode next = head
        newNode.next= head;// ;link

        //steps3 head =newNode
        head = newNode;

    } 
    // add last in linklist
     
    public void addlast(int data){
        Node  newNode= new Node(data);
        size++;
        if(head==null){
            head= tail=newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;

    }
    // add midlle
    public void addmid(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++; 
        } // i=idx-1; temp -> prev
        newNode.next=temp.next;
        temp.next=newNode;

    }
    // print linklist

    public void print(){ 
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println("null");
    }
    // remove first


    public int removefirst(){
        if(size ==0){
            System.out.println("llis empty");
            return Integer.MIN_VALUE;
        } else if (size==1){
            int val = head.data;
            head=tail= null;
            size=0;
            return val;
        }
        int val= head.data;
        head=head.next; 
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
    public int itrser(int key){
        Node temp= head;
        int i=0;
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
        addlinklist ll = new addlinklist();
       
        ll.addfirst(2);
        
        ll.addfirst(1);
        ll.addlast(4);
        ll.addlast(5);
        ll.addmid(2, 3);
        ll.print();
        // System.out.println(ll.size);
        ll.removefirst();
        ll.print();
        ll.removelast();
        ll.print(); 
        System.out.println(ll.itrser(3));
        System.out.println(ll.itrser(10));
    }
}