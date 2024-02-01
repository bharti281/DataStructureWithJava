package Apna_College;

import java.util.Scanner;

public class ArrayHWQ3 {
    public static void main(String[] args) {
        System.out.println("Enter the Size of Array");
        Scanner sc = new Scanner(System.in);
       int size= sc.nextInt();
        int no[] = new int[size];
        System.out.println("Enter the value of the array");
        for(int i=0; i<no.length;i++){
            no[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0;i<no.length-1;i++){
            if(no[i]>no[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The Array is sorted in ascending order");
        }
        else{
            System.out.println("The array is not sorted in ascending order");
        }
    }
}
