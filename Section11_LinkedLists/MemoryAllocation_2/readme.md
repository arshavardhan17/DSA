# 🔗 Memory Allocation in Linked Lists

Understanding how **memory is allocated** in a Linked List is key to mastering this data structure. Unlike arrays, linked lists use **dynamic memory allocation** — memory is allocated at runtime for each node.

---

## 🧠 How Memory Works in Linked Lists

A **Linked List node** typically contains:

- **Data** (the value)
- **Pointer** (reference to the next node)

In memory, these nodes are **not stored contiguously** like arrays. Instead, each node is placed wherever there is free space in the heap, and pointers are used to link them together.

---

## 🧩 Example in Java

```java
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;  // Data stored
        this.next = null;  // Pointer to next node (null by default)
    }
}
```

When you create a new node using:

```java
Node newNode = new Node(10);
```

Memory is allocated in the **heap**, and `newNode` holds the **reference** (address) of that memory location.

---

## 📊 Visualization

If we create:

```java
Node first = new Node(10);
Node second = new Node(20);
first.next = second;
```

Memory will look like:

```java
[first] -> | 10 | ref -> second |
[second] -> | 20 | null |
```

These nodes can be stored anywhere in memory, but their **references keep the list connected**.

---

## 🛠️ Memory Allocation Steps (Java/C++)

1. Allocate memory for a node using `new` (Java/C++) or `malloc()` (C).
2. Store data in the node.
3. Point the `next` reference to the next node or null.

---

## 🧹 Memory Deallocation

- In **Java**, garbage collection automatically frees unreferenced nodes.
- In **C/C++**, you must use `free()` or `delete` to deallocate memory manually.

  ```c
  free(node); // C
  ```

Failure to free memory in C/C++ leads to **memory leaks**.

---

## ✅ Advantages of Dynamic Allocation in Linked Lists

- No need to predefine size.
- Efficient insertion/deletion.
- Better use of memory as nodes are created only when needed.

---

## ⚠️ Common Memory Issues

| Issue            | Description                                    |
| ---------------- | ---------------------------------------------- |
| Memory Leak      | Forgetting to free memory in C/C++             |
| Dangling Pointer | Using a node after it’s been deleted           |
| Null Reference   | Accessing `next` of a null node (causes crash) |

---

## 📚 Conclusion

Linked Lists rely on **dynamic memory allocation**, which makes them flexible and powerful. Understanding how memory is created and connected with pointers is crucial for writing efficient and error-free code.

---

## 📖 References

- [GeeksforGeeks – Linked List in C](https://www.geeksforgeeks.org/linked-list-set-1-introduction/)
- [Visualgo – Linked List Visualization](https://visualgo.net/en/list)

---
