package Apna_College;

import java.util.Scanner;

public class printNnautral_number {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int no = sc.nextInt();
        for (int i = 0; i <= no; i++){
            sum = sum+i;
        }
        System.out.println("Your result is "+sum);


    }
}
