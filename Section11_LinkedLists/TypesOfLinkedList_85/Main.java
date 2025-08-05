package Section11_LinkedLists.TypesOfLinkedList_85;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(6);
        System.out.println(st);
        System.out.println(st.peek());// gives top element in stack
        st.pop();// remove last element in stack
        st.isEmpty();// Says wether the stack is empty or not
    }
}
