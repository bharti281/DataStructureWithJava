package Apna_College;

import java.util.Scanner;

public class EX1_Q7_usersInput {
    public static void main(String[] args) {
        int positive = 0 , negative=0, zero =0;
        System.out.println("Enter 1 to continue 0 for stop ");
        Scanner sc =new Scanner(System.in);
        int input = sc.nextInt();
        while (input==1){
            System.out.println("Enter your number ");
            int no = sc.nextInt();
            if(no>0){
                positive++;
            }
            else if(no<0){
                negative++ ;
            }
            else {
                zero++ ;
            }
            System.out.println("Enter 1 to continue 0 for stop ");
            input = sc.nextInt();
        }

        System.out.println("Positive = " +positive);
        System.out.println("negative = " +negative);
        System.out.println("zero = " +zero);



    }
}
