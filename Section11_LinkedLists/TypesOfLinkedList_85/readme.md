# 📚 Types of Linked Lists in Java

## 🚀 Introduction

A **Linked List** is a linear data structure where each element is a separate object called a **node**. Each node contains two parts:

- `data`: the value stored in the node
- `next`: a reference to the next node in the list

Java provides flexibility to implement different types of linked lists based on requirements.

---

## 🧠 Why Use Linked Lists?

- Dynamic size (unlike arrays)
- Efficient insertions/deletions (especially in the middle of the list)
- No memory wastage (no need to declare a fixed size)

---

## 🔗 Types of Linked Lists

### 1. Singly Linked List

In a **Singly Linked List**, each node contains:

- `data`
- `next` (points to the next node)

#### ▶ Structure:

`````

\[ data | next ] -> \[ data | next ] -> null

````java

#### ▶ Java Implementation:

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
`````

#### ▶ Characteristics

- One-directional traversal
- Easy to implement
- Insertions and deletions at the beginning are efficient

---

### 2. Doubly Linked List

In a **Doubly Linked List**, each node contains:

- `data`
- `prev` (points to previous node)
- `next` (points to next node)

#### ▶ Structure

```
null <- [ prev | data | next ] <-> [ prev | data | next ] -> null
```

#### ▶ Java Implementation:

```java
class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
```

#### ▶ Characteristics

- Bi-directional traversal
- More memory usage than singly linked list
- Efficient insertions/deletions from both ends

---

### 3. Circular Linked List

A **Circular Linked List** is where:

- The last node points back to the head (first node)
- Can be **singly** or **doubly** linked

#### ▶ Singly Circular Structure:

```java
[ data | next ] -> [ data | next ] --\
          ^--------------------------/
```

#### ▶ Java Implementation (Singly Circular):

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head = null;
    Node tail = null;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
}
```

#### ▶ Characteristics

- No null reference at the end
- Useful in round-robin scheduling
- Can traverse from any node infinitely

---

## ⚙️ Comparison Table

| Feature               | Singly Linked List | Doubly Linked List    | Circular Linked List |
| --------------------- | ------------------ | --------------------- | -------------------- |
| Direction             | Forward            | Forward & Backward    | Forward (or both)    |
| Memory Usage          | Low                | Higher (extra `prev`) | Moderate             |
| Traversal             | One way            | Two way               | Circular infinite    |
| Insert/Delete (Front) | O(1)               | O(1)                  | O(1)                 |
| Insert/Delete (End)   | O(n)               | O(1) (if tail known)  | O(1)                 |

---

## 🧪 Use Cases

| Use Case                         | Recommended List     |
| -------------------------------- | -------------------- |
| Browser history navigation       | Doubly Linked List   |
| Music playlist loop              | Circular Linked List |
| Stack implementation             | Singly Linked List   |
| Round-robin scheduling algorithm | Circular Linked List |

---

## 📌 Conclusion

Understanding the various types of linked lists is fundamental for building efficient data structures. Each type is optimized for specific operations and use cases, so choosing the right one depends on the scenario.

---

## 📁 Related Files

- `SinglyLinkedList.java` - Implementation of Singly Linked List
- `DoublyLinkedList.java` - Implementation of Doubly Linked List
- `CircularLinkedList.java` - Implementation of Circular Linked List

---

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
    }
}
```
