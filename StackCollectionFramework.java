package Apna_College;

import java.util.Stack;

public class StackCollectionFramework {
//    push at bottom

    public  static  void  pushAtBottom(int data ,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    //Reverse  stack

    public  static  void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top,s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(41);
        s.push(1);
        s.push(4);
        s.push(5);

//        pushAtBottom(10,s);
        reverse(s);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
