package Apna_College;

import java.util.Scanner;

public class HW_String_replace_atdirate_gmail_dot_com {
    public static void main(String[] args) {
        System.out.println("Enter your email");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String userName = " ";
        for(int i=0;i<str.length(); i++){
            if(str.charAt(i)=='@'){
                break;
            }
            else {
                userName += str.charAt(i);
            }
        }
        System.out.println(userName);

    }
}
