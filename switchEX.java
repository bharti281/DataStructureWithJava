package Apna_College;

import java.util.Scanner;

public class switchEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to 1 to 3");
        int button  = sc.nextInt();
//        if(button==1){
//            System.out.println("Hello");
//        }
//        else if(button==2){
//            System.out.println("Namste");
//        }
//        else if(button==3){
//            System.out.println("Bonjour");
//        }
//        else {
//            System.out.println("invaild button");
//        }


        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("invaild button");
        }
    }
}
