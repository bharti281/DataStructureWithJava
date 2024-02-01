package Apna_College;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does no contains 6");
        }
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does no contains 1 - we delete 1");
        }
        System.out.println("size of the set is "+ set.size());
        System.out.println(set);
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
