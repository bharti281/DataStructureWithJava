package Apna_College;

public class reverseStringUsingRec {
    public  static  void reverse(String s , int index){
        if(index == 0)
        {
            System.out.print(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        reverse(s,index-1);
    }
    public static void main(String[] args) {
        String s = "abcd";
        reverse(s,s.length()-1);
    }
}
