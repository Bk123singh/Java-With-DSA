







public class pratlinklist{
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
        public void printlinklist(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println("null");
    }

    public int removefirst(){
        if(size==0){
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;

        } else if(size ==1){
            int val = head.data;
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
            System.err.println("linklist is empty");
            return Integer.MIN_VALUE;
        } else if(size ==1){
            int val = head.data;
            head=tail=null;
            return val;
        }
        Node prev=head;
        for(int i=0; i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        return val;


    }

    public int  istertive(int key){
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

    public  Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;
    }

    public boolean checkpalidrome(){
        if(head==null&&head.next==null){
            return true;
        }
        Node mid=findmid(head);

        //reverse second half

        Node prev=null;
        Node curr =mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right= prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right = right.next;
        }
        return true;
    

    }

    
    public static void main(String args []){
        pratlinklist link=new pratlinklist();
        link.addfirst(10);
        link.addlast(20);
        link.addlast(20);
        link.addlast(10);
        link.printlinklist();
        System.out.println(link.checkpalidrome());
        
        // link.removefirst();
        // link.removelast();
        // link.printlinklist();
        
        // System.out.println(link.istertive(40));    
        
    

    }
}