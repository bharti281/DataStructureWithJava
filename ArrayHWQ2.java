package Apna_College;

import java.util.Scanner;

public class ArrayHWQ2 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array  = new int[size];
        System.out.println("Enter Arrays Values");
        for(int i=0; i<size; i++){
         array[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Largest Value is "+max);
        System.out.println("Smallest Value is "+min);

    }
}
