
class newPractice {

    public static class Node{
        int data;
        Node  next;
        public Node(int data){
            this.data=data;
            this.next=next;
        }
    }



    
    public static Node head;
    public static Node tail;
    public static int size;

// Add first the  Link list 
    public void  add(int data){
        Node newNode=new Node(data);
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
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;

    }

// Print link list
   public void printLL(){
    if(size==0){
        System.out.println("LL is empty");
    }

    Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");

   }


   public void reverseLL(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
     
    while(curr!=null){
        next =curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;

   }


    public static void main(String args[]){

    newPractice ll =new newPractice();

        ll.add(30);
        ll.add(20);
        ll.add(10);
        ll.addlast(20);
        ll.addlast(10);
        ll.addlast(40);
        ll.reverseLL();
    ll.printLL();

    }
}