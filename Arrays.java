package Apna_College;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int[] marks = new int[3];
//        int marks[] = new int[3];
//        int marks[] = {97,98,95};

//        marks[0] =97;
//        marks[1] =98;
//        marks[2] =99;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        for(int i=0; i<3;i++){
//            System.out.println(marks[i]);
//        }


//        Arrays With user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int  size = sc.nextInt();
        int no[] = new int[size];
        for(int i=0 ;i<size; i++) {
            System.out.println("Enter element");
            no[i] = sc.nextInt();
        }
        System.out.println("Enter element for find");
        int x = sc.nextInt();


//        for(int i=0 ;i<size; i++)
//        {
//            System.out.println(no[i]);
//        }

        for(int i=0 ;i<no.length; i++)
        {
            if(no[i]==x){
                System.out.println(x +" Found at index : "+i);
            }
        }
        System.out.println("Number not found");
    }

}
