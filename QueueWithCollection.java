package Apna_College;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithCollection {
    public static void main(String[] args) {
//        implement Queue interface with LinkedList
      //  Queue<Integer> q = new LinkedList<>();

//        implement Queue interface with ArrayDeque
        Queue<Integer> q = new ArrayDeque<>();


        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
