package Apna_College;

import java.util.HashSet;

public class printAllSubsequence {
//    This function user for when you want use duplicate entry
    public  static  void subsequence(String str, int index, String newStr){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
     char currChar = str.charAt(index);
//     to be inserted
        subsequence( str , index+1,newStr+currChar);
//        to be not inserted
        subsequence( str , index+1,newStr);
    }

    //    This function user for when you don't want use duplicate entry
    public  static  void printSubseq(String str , int index, String res, HashSet<String>allSubseq){
        if(index == str.length()){
            if (allSubseq.contains((res))){
                return;
            }
            allSubseq.add(res);
            System.out.println(res);
            return;
        }
        char currChar = str.charAt(index);
//     to be inserted
        printSubseq( str , index+1,res+str.charAt(index), allSubseq);
//        to be not inserted
        printSubseq( str , index+1,res, allSubseq);
    }
    public static void main(String[] args) {
        subsequence("aaa" , 0 ,"");
      HashSet<String> allSubseq = new HashSet<>();
        printSubseq("aaa" ,0, "", allSubseq);
    }
}
