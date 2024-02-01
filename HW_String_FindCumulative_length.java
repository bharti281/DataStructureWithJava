package Apna_College;

import java.util.Scanner;

public class HW_String_FindCumulative_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        String[] array = new String[size];
        int toLength = 0;

        for(int i=0; i<size;i++){
            array[i] = sc.next();
            toLength += array[i].length();
        }
        System.out.println(toLength);
    }
}
