# 📚 Working with Built-in Linked Lists (In-Depth)

In modern programming languages, built-in **Linked List** implementations offer a ready-to-use, efficient way to store and manipulate dynamic collections of data. This guide focuses on Java's `LinkedList` from the `java.util` package.

---

## 📌 What is a Built-in Linked List?

A built-in linked list is a **predefined class** provided by the programming language's standard library. It abstracts away the low-level pointer and node management and provides a clean API for:

- Adding/removing elements
- Iterating over elements
- Using it as a **queue**, **stack**, or **deque**

---

## 🧰 Java's `LinkedList` Overview

Java’s `LinkedList<E>` is a **doubly linked list** that implements:

- `List<E>` – allows positional access and modification
- `Deque<E>` – enables stack/queue/deque operations

### 🔗 Structure

Each node contains:

- Reference to **previous node**
- Reference to **next node**
- The **data (element)**

---

## ⚙️ Basic Operations

### ✅ Create a Linked List

```java
import java.util.LinkedList;

LinkedList<String> list = new LinkedList<>();
```

### ➕ Add Elements

```java
list.add("Apple");           // Add to end
list.addFirst("Mango");      // Add to front
list.addLast("Banana");      // Add to end
list.add(1, "Orange");       // Add at index 1
```

### ❌ Remove Elements

```java
list.remove();               // Removes first
list.remove("Orange");       // Removes by value
list.removeFirst();          // Removes first
list.removeLast();           // Removes last
list.remove(1);              // Removes by index
```

### 🔍 Access/Update Elements

```java
String first = list.getFirst();   // Get first
String last = list.getLast();     // Get last
String item = list.get(2);        // Get by index
list.set(1, "Pineapple");         // Update value
```

---

## 🧪 Advanced Methods

- `contains(Object o)` – Checks if element exists
- `indexOf(Object o)` – First index of element
- `lastIndexOf(Object o)` – Last index
- `clear()` – Removes all elements
- `peek()`, `poll()`, `offer()` – Queue-like operations

---

## 📦 Import Statement

```java
import java.util.LinkedList;
```

---

## 🛠️ Constructor

```java
LinkedList<Type> list = new LinkedList<>();
```

---

## 🧰 Commonly Used Methods (Grouped by Purpose)

### ➕ Adding Elements

| Method                | Description                |
| --------------------- | -------------------------- |
| `add(E e)`            | Adds to the end            |
| `add(int index, E e)` | Inserts at specified index |
| `addFirst(E e)`       | Adds to the front          |
| `addLast(E e)`        | Adds to the end            |
| `offer(E e)`          | Adds to the end (Queue)    |
| `offerFirst(E e)`     | Adds to the front (Deque)  |
| `offerLast(E e)`      | Adds to the end (Deque)    |

```java
list.add("A");
list.addFirst("B");
list.addLast("C");
list.add(1, "D");
```

---

### ❌ Removing Elements

| Method              | Description                                |
| ------------------- | ------------------------------------------ |
| `remove()`          | Removes head element                       |
| `remove(int index)` | Removes by index                           |
| `remove(Object o)`  | Removes first occurrence of element        |
| `removeFirst()`     | Removes first element                      |
| `removeLast()`      | Removes last element                       |
| `poll()`            | Retrieves and removes head (null if empty) |
| `pollFirst()`       | Same as `poll()`                           |
| `pollLast()`        | Retrieves and removes last                 |
| `clear()`           | Removes all elements                       |

```java
list.remove(); // removes first
list.pollLast(); // removes last safely
```

---

### 🔍 Accessing Elements

| Method           | Description                   |
| ---------------- | ----------------------------- |
| `get(int index)` | Gets element at index         |
| `getFirst()`     | Gets first element            |
| `getLast()`      | Gets last element             |
| `peek()`         | Returns head without removing |
| `peekFirst()`    | Returns first element         |
| `peekLast()`     | Returns last element          |

```java
String first = list.getFirst();
String item = list.get(2);
```

---

### 🔄 Updating Elements

| Method                | Description               |
| --------------------- | ------------------------- |
| `set(int index, E e)` | Replaces element at index |

```java
list.set(0, "Updated");
```

---

### 🔍 Searching Elements

| Method                  | Description                         |
| ----------------------- | ----------------------------------- |
| `contains(Object o)`    | Checks if list contains the element |
| `indexOf(Object o)`     | Returns index of first occurrence   |
| `lastIndexOf(Object o)` | Returns index of last occurrence    |

```java
if (list.contains("Apple")) {
    int pos = list.indexOf("Apple");
}
```

---

### 🔁 Iteration Methods

| Method                 | Description                 |
| ---------------------- | --------------------------- |
| `iterator()`           | Returns standard iterator   |
| `descendingIterator()` | Returns reverse iterator    |
| `listIterator()`       | Bidirectional list iterator |

```java
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

## 📁 Sample Java Program

```java
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.addFirst("C");
        list.addLast("Python");

        list.remove("C");

        System.out.println("List contents:");
        for (String lang : list) {
            System.out.println(lang);
        }

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }
}
```

---

## 🚀 Performance

| Operation              | Time Complexity |
| ---------------------- | --------------- |
| Add First/Last         | O(1)            |
| Remove First/Last      | O(1)            |
| Get by Index           | O(n)            |
| Search                 | O(n)            |
| Insert/Delete at index | O(n)            |

> Note: LinkedList is better than ArrayList when frequent insertions/deletions are required, but slower in random access.

---

## 🛠️ When to Use Built-in LinkedList?

✅ Use `LinkedList` when:

- You need frequent insertions/deletions from the beginning/middle.
- You want to use it as a **Queue** or **Deque**.
- Order of elements matters.

❌ Avoid if:

- You need fast random access (use `ArrayList` instead).

---

## 🧼 Memory Management

In Java, built-in linked lists use **heap memory** for node objects, and unused nodes are collected by the **garbage collector**. No need for manual memory deallocation.

---
