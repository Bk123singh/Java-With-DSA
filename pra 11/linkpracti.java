public class linkpracti{
    public class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

public void addfirst(int data){
    Node neweNode=new Node(data);
    size++;
    if(head==null){
        head=tail=neweNode;
    }
    neweNode.next=head;
    head=neweNode;
}

public void addlast(int data){
    Node newnNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newnNode;
    }

    tail.next=newnNode;
    tail=newnNode;
}

public void printll(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+ "->");
        temp=temp.next;
    }
    System.out.println("null");
}

public int  removefirst(){
    if(size==0){

        System.out.println("ll is empty");
    } 
    else if(size==1){
        int val=head.data;
        head=tail=null;
        return val;
    }
    int val = head.data;
    head.next=head;
    return val;


}

    public static void main(String args []){

        linkpracti ll = new linkpracti();
        ll.addfirst(10);
        ll.addlast(20);
        ll.addlast(30);
        ll.addlast(40);
        ll.printll();
    }
}