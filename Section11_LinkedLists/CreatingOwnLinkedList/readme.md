# 🧱 Build Your Own Linked List in Java (From Scratch)

## 📌 Introduction

This guide walks you through **creating a custom Linked List class in Java**—without using any built-in Java data structures like `java.util.LinkedList`. You'll understand the internal mechanics and learn to implement common linked list operations.

---

## 🧠 What is a Linked List?

A **Linked List** is a linear data structure where elements (nodes) are stored in non-contiguous memory locations. Each node holds:

- **Data** — the actual value
- **Pointer** — reference to the next node

---

## 🧩 Node Structure

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

---

## ⚙️ Operations to Implement

### ✅ 1. Insertion Operations

#### 🔹 Insert at Beginning

```java
public void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}
```

#### 🔹 Insert at End

```java
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
```

#### 🔹 Insert at Specific Position

```java
public void insertAtPosition(int pos, int data) {
    if (pos < 0) return;

    if (pos == 0) {
        insertAtBeginning(data);
        return;
    }

    Node newNode = new Node(data);
    Node current = head;
    for (int i = 0; current != null && i < pos - 1; i++) {
        current = current.next;
    }

    if (current == null) return;

    newNode.next = current.next;
    current.next = newNode;
}
```

---

### ❌ 2. Deletion Operations

#### 🔹 Delete from Beginning

```java
public void deleteFromBeginning() {
    if (head != null) {
        head = head.next;
    }
}
```

#### 🔹 Delete from End

```java
public void deleteFromEnd() {
    if (head == null || head.next == null) {
        head = null;
        return;
    }
    Node current = head;
    while (current.next.next != null) {
        current = current.next;
    }
    current.next = null;
}
```

#### 🔹 Delete at Position

```java
public void deleteAtPosition(int pos) {
    if (head == null || pos < 0) return;

    if (pos == 0) {
        head = head.next;
        return;
    }

    Node current = head;
    for (int i = 0; current != null && i < pos - 1; i++) {
        current = current.next;
    }

    if (current == null || current.next == null) return;

    current.next = current.next.next;
}
```

#### 🔹 Delete by Value

```java
public void deleteByValue(int value) {
    if (head == null) return;

    if (head.data == value) {
        head = head.next;
        return;
    }

    Node current = head;
    while (current.next != null && current.next.data != value) {
        current = current.next;
    }

    if (current.next == null) return;

    current.next = current.next.next;
}
```

---

### 🔍 3. Search Operation

```java
public boolean search(int key) {
    Node current = head;
    while (current != null) {
        if (current.data == key) return true;
        current = current.next;
    }
    return false;
}
```

---

### 📜 4. Traversal (Display)

```java
public void display() {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
}
```

---

### 🔁 5. Reverse the List

```java
public void reverse() {
    Node prev = null;
    Node current = head;
    Node next = null;

    while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    head = prev;
}
```

---

### 🔢 6. Count the Nodes

```java
public int count() {
    int count = 0;
    Node current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}
```

---

## 🧪 Example Usage

```java
public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertAtEnd(10);
    list.insertAtBeginning(5);
    list.insertAtPosition(1, 7);
    list.display(); // 5 -> 7 -> 10 -> null

    list.deleteByValue(7);
    list.display(); // 5 -> 10 -> null

    System.out.println("Found 10? " + list.search(10)); // true
    System.out.println("Count: " + list.count()); // 2

    list.reverse();
    list.display(); // 10 -> 5 -> null
}
```

---

## 📦 Project Structure

```
📁 LinkedListProject
├── LinkedList.java
└── README.md
```

---

## ✅ Summary

By implementing your own linked list:

- You understand memory and pointer management
- You improve your DSA and Java skills
- You're ready for technical interviews and deeper algorithms

## 👨‍💻 Author

**Arsha Vardhan**
Java Developer | CSE Student
