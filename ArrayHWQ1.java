package Apna_College;

import java.util.Scanner;

public class ArrayHWQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        String name[] = new String[size];

        for(int i=0; i<name.length; i++){
            System.out.println("Enter name ");
            name[i] = sc.next();
        }
        for(int i=0; i<name.length; i++){
            System.out.println(name[i]);

        }
    }
}
