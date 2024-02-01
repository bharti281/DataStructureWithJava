package Apna_College;

public class MoveAllX {
    public  static  void move (String str, int index, int count,String newString){

      if(index == str.length()){
          for(int i=0;i<count;i++){
              newString += 'x';

          }
          System.out.println(newString);
          return;
      }
        char currChar = str.charAt(index);
      if(currChar == 'x'){
          count++;
          move (str, index+1, count,newString);
      }
      else {
          newString +=currChar;
          move (str, index+1, count,newString);
      }


    }
    public static void main(String[] args) {
        move ("axbcdxx",0, 0,"");
    }
}