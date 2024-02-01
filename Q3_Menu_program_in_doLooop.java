package Apna_College;

import java.util.Scanner;

public class Q3_Menu_program_in_doLooop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int marks = 10;
        System.out.println("Enter 1 to Start and 0 for stop");
        int i = sc.nextInt();

        do{

            System.out.println("Enter student marks");
            int marks = sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is good");
            }
            else if(marks>=60 && marks<=89){
                System.out.println("This is also good ");
            }
            else if(marks>=0 && marks<=59){

                System.out.println("This is good as well");
            }
            else {
                System.out.println("invaild input");
            }
            System.out.println("Want to continue ? (yes(1) no(0))");
            i = sc.nextInt();
        }while(i==1);

    }
}
