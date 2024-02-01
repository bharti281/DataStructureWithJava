package Apna_College;

import java.util.LinkedList;

public class LLCollectionFramworks {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        System.out.println(list);

//        by default element insert in the last
//        list.addLast("list");
        list.add("list");
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){

            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("Null");

//        list.removeFirst();
//        System.out.println(list);
//
//        list.removeLast();
//        System.out.println(list);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
