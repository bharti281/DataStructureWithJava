package Apna_College;

import java.util.ArrayList;

public class StackUsingArrayList {

        static class MyStack {
             ArrayList<Integer> list = new ArrayList<>();

            public  boolean isEmpty() {
                return list.size() == 0;
            }

            public  void push(int data) {
                list.add(data);
            }

            public  int pop() {
                if (isEmpty()) {
                    return -1;
                }
                int top = list.remove(list.size() - 1);
                return top;
            }

            public  int peek() {
                if (isEmpty()) {
                    return -1;
                }
                return list.get(list.size() - 1);
            }
        }

    public static void main(String[] args) {
        MyStack  st = new MyStack();
        st.push(45);
        st.push(5);
        st.push(4);
        st.push(6);

        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
