package Apna_College;

public class RecursionPrintNoAsc {
        public  static  void printNum(int n){
            if(n==6)
            {
                return;
            }
            System.out.println(n);
            printNum(n+1);

        }
    public static void main(String[] args) {
        printNum(1);
    }
}
