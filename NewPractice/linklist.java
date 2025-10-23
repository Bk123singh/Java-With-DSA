public class linklist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static  Node tail;
    public static Node head;
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

  public void addlast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
     tail.next=newNode;
     tail=newNode;

  }

  public int removeFirst(){
    if(size==0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }
   if(size==1){
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

  public int removelast(){
    if(size==0){
       System.out.println("ll is empty");
       return Integer.MIN_VALUE; 
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    Node prev=head;
    for(int i=0; i<size-2;i++){
        prev=prev.next;
    }
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
  }


  public void addMid(int data, int idx){
    if(idx==0){
        addfirst(data);
        return;
    }
    Node newNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i< idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;

  }

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
  public void PrintLL(){
    if(head==null){
        System.out.println("LL is empty");
        return;
    }
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data + "->");
        temp=temp.next;
    }
    System.out.println("null");

  }
  

public int findVal(int key){
    Node temp=head;
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

        linklist ll= new linklist();
       ll.addfirst(40);
       ll.addfirst(30);
       ll.addfirst(20);
       ll.addfirst(10);
       ll.addlast(50);
       ll.addlast(60);
       ll.addfirst(5);
       ll.addfirst(2);
       ll.PrintLL();
       ll.removeFirst();
       ll.removelast();
       ll.PrintLL();
       ll.addMid( 15, 2);
       ll.addMid( 18, 3);
       ll.PrintLL();
    }
}