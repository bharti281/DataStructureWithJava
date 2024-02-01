package Apna_College;

public class LL {
    Node head;
    private  int size;
    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
//    add in link list  (add first)
    public void addFirst(String data){
        Node newNode = new  Node(data);
        if(head == null){
            head = newNode;
            newNode.next = null;
            return;
        }
        newNode .next = head;
        head = newNode;
    }
    //    add in link list  (add last)

    public void addLast(String data){
        Node newNode = new  Node(data);
        if(head == null){
            head = newNode;
            newNode.next = null;
            return;
        }
        Node currNode = head;
        while (currNode.next !=null){
            currNode  = currNode.next;
        }
        currNode.next =newNode;

    }
    //print List

    public void printList()
    {
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode !=null){
            System.out.print(currNode.data+ "  --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //Delete first

    public  void deleteFirst(){
        if(head == null)
        {
            System.out.println("The list is empty");
        }
        size--;
        head = head.next;
    }
    //Delete last
    public  void deleteLast(){
        if(head == null)
        {
            System.out.println("The list is empty");
        }
        size--;
        if(head.next == null){
            head = null;
            return;

        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
     public  void printSize(){
         System.out.println("The size of the list is "+ size);
     }

     public  void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
     }
    public  Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return  head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next .next =head;
        head.next = null;
        return newHead;
     }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();


        list.printSize();


        list.addLast("List");
        list.printList();
        list.printSize();

//        list.reverseIterate();
        list.head = list.reverseRecursive(list.head);
        list.printList();

    }
}
