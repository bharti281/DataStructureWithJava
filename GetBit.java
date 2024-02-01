package Apna_College;

//------------This Example used for find which bit on the nth position-------------------
public class GetBit {
    public static void main(String[] args) {
        int no =5;
        int pos = 3;
        int bitmask = 1<<pos;
        if((bitmask & no)==0)
        {
            System.out.println("The bit was 0");
        }
        else {
            System.out.println("Bit was non zero");
        }
    }
}
