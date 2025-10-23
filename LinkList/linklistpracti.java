public class linklistpracti{
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
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    public void addlast(int data){
        Node newNode=new Node(data);
        size--;
        if(head==null){
            head=tail=null;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }

    public int removefirst(){
        if(size==0){
            System.out.println("lll is empty");
        } else if (size==1){
            int val=head.data;
            size=0;
            head=tail=null;
            return val;

        }
        
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }    

    public int removelast(){
        if(size==0){
            System.out.println("ll  is empty");
        } else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev =head;
        for(int i=0;i<size-2; i++){
            prev= prev.next;
        }

        int val = prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        
    }

   

    public void printll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    // public int  findsize(){
    //     Node temp=head;
    //     int size =-1;
    //     while(temp != null){
    //         temp=temp.next;
    //         size++;
    //     }
    //     return size;

    // }

    
    

    public static void main(String args[]){

        linklistpracti ll=new linklistpracti();
       ll.addfirst(20);
       ll.addfirst(10);
       ll.addlast(30);
       ll.addlast(40);
       ll.addlast(50);

       ll.printll();
       ll.removefirst();
       ll.removefirst();
       ll.removelast();

    //    System.out.println(ll.findsize());
        ll.printll();

        
    }
}