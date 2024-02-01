package Apna_College;

import java.util.HashSet;

public class HashmapQ2 {
    public  static  int union(int arr1[] , int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length; j++){
            set.add(arr2[j]);
        }
        return set.size();

    }
    public static  int intersection (int arr1[] , int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0; j<arr1.length; j++){
            count++;
            set.add(arr2[j]);
        }

        return count;
    }
    public static void main(String[] args) {
    int arr1[] = {7,3,9};
    int arr2[] = {6,3,9,2,9,4,1};
        System.out.println("union "+union( arr1,arr2));
        System.out.println("intersection "+intersection(arr1,arr2));
    }
}
