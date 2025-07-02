# 📦 Creating Your Own Array in Java

This project demonstrates **how to create your own array implementation** from scratch in Java—without using any external libraries like `ArrayList`. It's a great exercise to understand how arrays work internally and how operations like insertion, removal, and searching are handled.

---

## 📘 What You'll Learn

- How arrays work under the hood
- Dynamic insertion logic
- Linear search implementation
- Manual deletion logic
- How to override `toString()` for custom output

---

## 🔧 Array.java — Class Breakdown

```java
public class Array {
    private int[] items;         // Internal static array
    private int CurrentIndex;    // Tracks number of inserted elements
```

### 🔹 Constructor

```java
public Array(int initialSize) {
    this.items = new int[initialSize];
}
```

- Initializes the internal array with a fixed size.
- You cannot insert more elements than the size unless dynamic resizing is implemented (not included yet).

---

### 🔹 `insert(int value)`

```java
public void insert(int value) {
    this.items[CurrentIndex] = value;
    CurrentIndex++;
}
```

- Inserts `value` at the next available position.
- Assumes space is available (⚠️ doesn't handle overflow or resizing).

---

### 🔹 `toString()`

```java
public String toString() {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int i = 0; i < this.CurrentIndex; i++) {
        str.append(this.items[i]).append(", ");
    }
    str.append("\b\b]");
    return str.toString();
}
```

- Returns a string representation of the array: `[1, 2, 3]`.

---

### 🔹 `Search(int value)`

```java
public int Search(int value) {
    for (int i = 0; i < this.CurrentIndex; i++) {
        if (this.items[i] == value)
            return i;
    }
    return -1;
}
```

- Performs **linear search** to find the index of the value.
- Returns `-1` if the value is not found.

---

### 🔹 `removeAt(int index)`

```java
public void removeAt(int index) {
    if (index >= this.CurrentIndex) {
        throw new IllegalArgumentException();
    }
    for (int i = index; i <= this.CurrentIndex - 2; i++) {
        this.items[i] = this.items[i + 1];
    }
    CurrentIndex--;
    this.items[CurrentIndex] = 0;
}
```

- Removes the item at the given index.
- Shifts elements to the left to fill the gap.
- Reduces the `CurrentIndex` and zeroes out the last value.

---

## 🚀 Main.java — Testing

```java
public class Main {
    public static void main(String[] args) {
        Array arr = new Array(5);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        System.out.println(arr);
    }
}
```

## ⚠️ Limitations

- No **dynamic resizing** (e.g., like `ArrayList`)
- No **bounds checking** in `insert()`
- Fixed array size
- Can’t insert at specific positions

---

## 📈 Time Complexity Summary

| Operation       | Time Complexity |
| --------------- | --------------- |
| Insert (end)    | O(1)            |
| Search (linear) | O(n)            |
| Remove (by idx) | O(n)            |
| Print           | O(n)            |

---

## 📌 Future Improvements

- Add dynamic resizing (double size when full)
- Add insertAt(index, value)
- Add size getter method
- Add contains(value)
- Add clear/reset method

---

## 🧠 Why Build This?

Understanding internal data structures helps you:

- Master memory handling
- Write efficient custom structures
- Crack technical interviews with confidence

---

## ✅ Conclusion

This project provides hands-on understanding of array implementation—beyond Java's built-in collections. Feel free to extend and explore further!

---
