public class fracatif{
    public static  class Queue{
        static int arra[];
        static int size;
        static int rear;
        Queue(int n){
            arra=new int[n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        public static void add(int data){
            if(rear=size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arra[rear]=data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front =arra[0];
            for(int i=0l i< rear;i++){
                arra[i]=arra[i+1];
            }
            rear=rear-1;
            return front;
        }

        

    }
}