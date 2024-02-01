package Apna_College;


import java.awt.*;

public class ImpQInLL {
    Node head;
    private  int size;
    ImpQInLL(){
        this.size = 0;
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //    add in link list  (add first)
    public void addFirst(int data){
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

    public void addLast(int data){
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
        newNode.next = head.next.next ;
//        currNode.next = head.next.next;

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
    public Node removeNthNode(Node head ,int n){
        if(head.next == null){
            return  null;
        }
        int size =  0;
        Node curr = head;
        while (curr != null){
            curr = curr.next;
            size++;
        }

        if(n== size){
            return  head.next;
        }
        int indexToSearch = size-n;
        Node prev = head;
        int i =1;
        while (i!=indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }


    //check the linkedList is palindrom or not

    public  boolean isPalindrome(Node node){
        if(head==null || head.next == null){
            return  true;
        }
        Node middle = FindMiddle(head);
        Node secondHalfStart = reverse(middle.next);
        Node firstHalfStart = head;
        while(secondHalfStart != null ){
            if(firstHalfStart.data != secondHalfStart.data){
                return  false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return  true;
    }

    private Node FindMiddle(Node head) {
        Node hare  = head;
        Node turtle = head;
        while (hare.next != null &&  hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    private Node reverse(Node head) {
        Node prev  = null;
        Node curr = head;
        while (curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return  prev;

    }

//    Check cycle of linked list

    public  boolean hasCycle (Node head){
        if(head ==  null){
            return  false;
        }
        Node hare = head ;
        Node turtle = head;
        while (hare.next != null &&  hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return hare == turtle;

    }

    public static void main(String[] args) {
        ImpQInLL list = new ImpQInLL();
//        list.addFirst(1);
//        list.addFirst(2);
//        list.printList();
//
//        list.addLast(3);
//        list.printList();
//
//        list.addFirst(4);
//        list.printList();
//
////        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();
//
//
//        list.printSize();
//
//
//        list.addLast(5);
//        list.printList();
//        list.printSize();
//        Node value = list. removeNthNode(list.head,3);
//        System.out.println(value);

//        list.reverseIterate();
//        list.head = list.reverseRecursive(list.head);

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(5);

//        list.printList();

        System.out.println(list.hasCycle(list.head));
//        System.out.println(list.isPalindrome(list.head));
//        list.printList();


    }
}

