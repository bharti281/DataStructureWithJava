package Apna_College;

import java.util.Scanner;

public class HWString_Replace_e_To_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String result=" " ;
        String str =  sc.next();
        for (int i = 0; i<str.length(); i++){
            result= str.replace("e","i");
        }
        System.out.println(result);


//        for (int i = 0; i<str.length(); i++){
//            if(str.charAt(i) == 'e'){
//                result += 'i';
//            }
//            else {
//                result += str.charAt(i);
//            }
//        }
//        System.out.println(result);

    }
}
