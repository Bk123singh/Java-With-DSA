
public class hh {
    public static class Queue {
        private int[] arr;
        private int size;
        private int rear;
        private int front;

        // Constructor
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = 0;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear < front;
        }

        // Push an element into the queue
        public void push(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // Remove an element from the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int frontElement = arr[front];
            front++;
            if (front > rear) { // Reset the queue if empty
                front = 0;
                rear = -1;
            }
            return frontElement;
        }

        // Peek the front element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        hh queue = new hh(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println(queue.peek()); // Output: 10

        System.out.println(queue.remove()); // Output: 10
        System.out.println(queue.remove()); // Output: 20

        queue.push(40);
        queue.push(50);
        queue.push(60);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove()); // Output: 30, 40, 50, 60
        }
    }
}