package Apna_College;

public class keyPadCombination {
    public  static  String KeyPad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public  static  void printKyeBoardCombination(String number, int index, String res){
        if(index == number.length()){
            System.out.println(res);
            return;
        }
        for(int i=0;i<KeyPad[number.charAt(index) - '0'].length();i++){
            char curr = KeyPad[number.charAt(index) - '0'].charAt(i);
            printKyeBoardCombination( number,  index+1, res+curr);
        }
    }
    public static void main(String[] args) {
        String number = "23";
        printKyeBoardCombination(number, 0, "");

    }
}
