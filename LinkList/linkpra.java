public class linkpra {
    public class Node{
        int data ;
        Node next;
        public Node(int data){
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
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ->");
            temp=temp.next;
        }
        System.out.println("null");
    } 

    public void addlast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        

    }

    public int itrasear(int key){
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
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx= helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public void reverse(){// O(n)
        Node prev =null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        head = prev;
    }
 public void deleteNthfromEnd(int n){
    // calculate size
    int sz=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
        head = head.next;
        return;
    }
    //sn-n
    int i=1; 
    int iToFind=sz-n;
    Node prev =head;
    while(i<iToFind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;
 }  
 // slow fast approach

 public Node findMid(Node head){
    Node slow=head;
    Node fast=head;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
 }

 public boolean checkPalindrom(){
    if(head==null|| head.next==null){
        return true;
    }
    // find midNode
    Node mid=findMid(head);
    
    //  reverse 2nd half

    Node prev =null;
    Node curr=mid;
    Node next;
    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        
    }
    Node right=prev;
    Node left = head;
    // check left half and fight half
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
 }


    public static void main(String [] args){
        linkpra ll = new linkpra();
        // ll.addfirst(10);
        // ll.addfirst(20);
        // ll.addfirst(30);
        // ll.addlast(40);
        // ll.addlast(50);
        // ll.addfirst(5);
        // ll.print();
        // ll.deleteNthfromEnd(2);
        // ll.print();
        // System.out.println(ll.checkPalindrom());
        ll.addlast(10);
        ll.addlast(20);
        ll.addlast(10);
        ll.print();
        System.out.println(ll.checkPalindrom());
    }
}