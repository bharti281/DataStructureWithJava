package Apna_College;

public class removeDuplicate {
    public  static  boolean [] map = new boolean[26] ;
    public  static  void remove(String str, int index, String newString){
        if(index == str.length())
        {
            System.out.println("Your String is --> "+newString);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a']){
            remove( str,  index+1, newString);
        }
        else {
            newString += currChar;
            map[currChar - 'a'] =true;
            remove( str,  index+1, newString);
        }

    }
    public static void main(String[] args) {
        remove("aaabbcc",0, "");
    }
}
