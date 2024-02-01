package Apna_College;

import java.util.Scanner;

public class Updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice 0 or 1");
        int oper = sc.nextInt();

        int no = 5;
        int pos = 2;
       int bitmask = 1<<pos;
       if(oper==1)
       {
           int newno = bitmask|no;
           System.out.println(newno);
       }
       else {
           int onescomp = ~(bitmask);
           int newno = onescomp & no;
           System.out.println(newno);
       }

    }
}
