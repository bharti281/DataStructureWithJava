package Apna_College;

import java.util.ArrayList;

public class printSubSet {
    public  static  void printSubSets(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static  void findSubSet(int n , ArrayList<Integer> subset){
        if(n==0){
            printSubSets(subset);
            return;
        }
        subset.add(n);
        findSubSet(n-1,subset);

        subset.remove(subset.size()-1);
        findSubSet(n-1,subset);

    }
    public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubSet(n,subset);

    }
}
