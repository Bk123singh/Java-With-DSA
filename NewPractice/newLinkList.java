
public class newLinkList {
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

    public void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void prinlLL(){
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

    public int removeLast(){
            if(size==0){
            head=tail=null;
            }
            else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            Node prev=head;
            for(int i=1;i<size-2;i++){
                prev=prev.next;
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
    }

    public int helper(Node head, int key){
        if(head==null){
            return 1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }

        return idx+1;

    }

    public int reSearch(int key){
        return helper(head, key);
    }

   
    public void deleteFromEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
        temp=temp.next;
        sz++;
    }

    if(n==sz){
        head=head.next;
        return;
    }
    int i=1;
    int Nth=sz-n;
    Node prev=head;
    while(i< Nth){
    prev=prev.next;
    i++;
    }
    prev.next=prev.next.next;
    return;
    }

    // slow fast approach to find the mid Node
    public Node FindMid(Node head){

        Node slow=head;
        Node fast=head;
        while( fast.next !=null && fast.next.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
       return slow; 
    }

    public boolean ChechPalidrome(){
        if(head==null || head.next==null){
            return true;
        }

        //Stap1 find mid Node
        Node midNode=FindMid(head);

        //stap2 reverse 2half 
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        // 

        Node right=prev;
        Node left=head;

        // check right half and righ half is equal

        while(right !=null){
            if(left.data !=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return  true;
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(prev != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
    }


    public static void main(String[] args) {

        newLinkList ll=new newLinkList();

       ll.addfirst(10);
       ll.addlast(20);
       ll.addlast(30);
       ll.addlast(20);
       ll.addlast(10);
       ll.prinlLL();
       ll.reverse();
       ll.prinlLL();

       
    

        
    }
}