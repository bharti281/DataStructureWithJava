package Apna_College;

import java.util.Scanner;

public class printtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int no = sc.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.println(no +"X"+ i +" = "+ no*i);
        }
    }
}
