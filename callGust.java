package Apna_College;

public class callGust {
    public  static  int callGusts(int n){
        if(n<=1){
            return 1;
        }
        int ways1 = callGusts(n-1);
        int ways2 = (n-1)*callGusts(n-2);
        return ways1+ways2;
    }
        public static void main(String[] args) {
            System.out.println(  callGusts(4));

    }
}
