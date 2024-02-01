package Apna_College;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<String> list2 = new ArrayList<String>();
//        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

//        add element
        list.add(0);
        list.add(2);
        list.add(3);


        list1.add(0);
        list1.add(2);
        list1.add(3);
        System.out.println(list);

//        get element
        int element = list.get(0);
        System.out.println(element);

//        add element in between
        list.add(1,1);
        System.out.println(list);

//        set element / modify element
        list.set(0,5);
        System.out.println(list);

//        delete element
        list.remove(3);
        System.out.println(list);

//        find size
        int size = list.size();
        System.out.println(size);

//        loops on the arraylist
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();

//        sorting
        Collections.sort(list);
        System.out.println(list);


//        to add a two list
        list.addAll(3,list1);
        System.out.println(list);

//         to remove a two list
       list.removeAll(list1);
        System.out.println(list);

    }

}
