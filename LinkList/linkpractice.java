







public class linkpractice {
    public static class Node {
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
    public void addfist(int data){
        Node newnNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnNode;
        }
        newnNode.next=head;
        head= newnNode;
    }

    public  void addlast(int data){
        Node newnNode= new Node(data);
        size++;
        if(head ==null){
            head=tail=newnNode;
        }
        tail.next=newnNode;
        tail=newnNode;
    }

    public void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + ("->"));
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int  removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if( size==1){
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
            return  Integer.MIN_VALUE;       
        } else if(size == 1){
            int val= head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int searchkey(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            i++;
            
        }
        return -1;
    }


    public void reversell(){
        Node prev=null;
        Node curr=tail=head;
        Node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        head=prev;
    }

    public  void ulta(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public  void deleteNth(int n){
        int sz=0;
       Node  temp=head;
       while(temp!=null){
        temp=temp.next;
        sz++;

       }
       if(sz==n){
        head=head.next;
        return;
       }
       int i=1;
       int iton=sz-n;
       Node prev=head;
       while(i<iton){
        prev=prev.next;
        i++;
       }
       prev.next=prev.next.next;
       return;


    }

    public  static String  reverse(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));

        }
        return sb.toString();
        
    }

    public static boolean  checkpali(String str){
          int n=str.length();
          for(int i=0; i<str.length()/2;i++ ){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
          }
          return true;


    }

    public static String  uppercase(String str){
        
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for(int i=1; i<str.length();i++){
            if(str.charAt(i)== str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));

            }
          
        }
        return sb.toString();
    }

    public static void main(String args []){
    linkpractice ll = new linkpractice();
    // ll.addfist(10);
    // ll.addlast(20);
    // ll.addlast(30);
    // ll.addlast(40);
    // ll.printll();
    // ll.deleteNth(3);
    // ll.printll();

    String str = new String("singh is king");
    System.out.println(uppercase(str));
    
    
    }
}
