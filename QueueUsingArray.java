package Apna_College;

public class QueueUsingArray {
    public  static  class queue{
        static  int arr[];
        static  int size;
        static  int rear = -1;
        queue(int n){
            arr = new int[n];
             this.size = n;
        }
        public  static boolean isEmpty(){
            return  rear == -1;
        }
        //Add in queue
        public  static  void enqueue(int data){
            if(rear==size-1){
                System.out.println("full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        //Remove in queue
        public  static  int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        //View all queue

        public  static  int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }

    }
    public static void main(String[] args) {
        queue  q = new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
