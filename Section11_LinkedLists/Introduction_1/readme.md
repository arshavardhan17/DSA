# 📚 Linked List - Introduction

A **Linked List** is a linear data structure where each element (called a _node_) contains:
**Data** – the actual value stored.
**Pointer** – a reference to the next node in the sequence.

Unlike arrays, linked lists are not stored in contiguous memory locations. Instead, each node points to the next, allowing dynamic memory usage and efficient insertion/deletion operations.

---

## 🧠 Why Use Linked Lists?

- Dynamic size (no need to predefine size like arrays)
- Efficient insertions and deletions (especially in the middle or at the beginning)
- Useful in memory management and implementation of advanced data structures

---

## 🧩 Types of Linked Lists

1. **Singly Linked List**  
   Each node points to the next node only.

2. **Doubly Linked List**  
   Each node contains two pointers: one to the next node, and one to the previous node.

3. **Circular Linked List**  
   The last node points back to the first node, forming a circle.

---

## 🔧 Basic Operations

- **Insertion**  
  Add a node at the beginning, middle, or end.

- **Deletion**  
  Remove a node from the beginning, middle, or end.

- **Traversal**  
  Visit each node to access or print data.

- **Search**  
  Find a node with a specific value.

- **Update**  
  Change the value of a node.

---

## ✅ Advantages

- Dynamic memory usage
- Easy insertion/deletion
- Efficient queue/stack implementation

---

## ❌ Disadvantages

- More memory (extra pointer in each node)
- No random access (O(n) for access)
- Slower traversal than arrays

---
