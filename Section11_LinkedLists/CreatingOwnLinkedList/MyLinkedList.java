package Section11_LinkedLists.CreatingOwnLinkedList;

// import org.w3c.dom.Node;

// class node {
// public int data;
// public Node next = null;

// public Node(int data){
// this.data=data;
// }
// }

// public class MyLinkedList {
// private Node head;

// public MyLinkedList() {
// head = null;
// }

// public void insert(int value) {
// Node node = new Node(value);

// }
// }
import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Before Reverse: " + list);
        Collections.reverse(list);
        System.out.println("After Reverse: " + list);
    }
}
