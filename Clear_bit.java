package Apna_College;

public class Clear_bit {
    public static void main(String[] args) {
        int no = 5;
        int pos = 2;
        int bit_mask = 1<<pos;
       int notBitMask = ~bit_mask;
       int newNo = notBitMask & no;
        System.out.println(newNo);
    }
}
