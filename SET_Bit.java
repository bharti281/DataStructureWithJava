package Apna_College;

public class SET_Bit {
    public static void main(String[] args) {
        int no =5;
        int pos = 1;
        int  bitmask = 1<<pos;
        int newno =(bitmask|no);
        System.out.println(newno);
    }
}
