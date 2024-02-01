package Apna_College;

public class CircularQueueUsingArray {
    static class QueueCircular {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        QueueCircular(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return ( rear+1 ) % size == front;
        }

        //Add in the Queue
        public static void enqueue(int data) {
            if (isFull()) {
                System.out.println("Full Queue");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = ( rear + 1 ) % size;
            arr[rear] = data;
        }

        //Remove element in the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = ( front + 1 ) % size;
            }
            return result;
        }

        //View Queue data
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        QueueCircular q = new QueueCircular(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.remove();
//        System.out.println( );
        q.enqueue(6);

        q.remove();
        q.enqueue(8);
//        System.out.println(  );

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();

        }
    }
}