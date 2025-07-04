# 📘 Full Explanation of Custom Dynamic Array Code in Java

---

## 🔹 File 1: `Array.java`

```java
package Section9_Linear_DS.CreatingOwnArrays_69;
```

- This defines the package where this class belongs. Organizing code into packages helps with modularity and reuse.

---

### 🔧 Class Definition and Fields

```java
public class Array {
    private int[] items;
    private int CurrentIndex;
```

- `items`: The actual array storing integers.
- `CurrentIndex`: Tracks how many elements are currently inserted. It also represents the next index where insertion can happen.
- This simulates a dynamic array (like `ArrayList`), since Java arrays are of **fixed size**.

---

### 🧱 Constructor

```java
public Array(int initialSize) {
    this.items = new int[initialSize];
}
```

- Initializes `items` with a given initial size.
- `CurrentIndex` is automatically set to `0` by Java (default value for `int`).

✅ **Example:**

```java
Array arr = new Array(5);
// Now: items = [0, 0, 0, 0, 0], CurrentIndex = 0
```

---

### ➕ Insert Method

```java
public void insert(int value) {
    if (CurrentIndex == items.length) {
        int[] temp = new int[items.length * 2];
        for (int i = 0; i < CurrentIndex; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }
    this.items[CurrentIndex] = value;
    CurrentIndex++;
}
```

#### 📌 What it does

- Inserts `value` at the end of the array.
- If the array is full (`CurrentIndex == items.length`), a new array with **double the size** is created.
- Old values are copied into the new array (`temp`) using a `for` loop.
- `items` now refers to the new resized array.
- Then the value is stored at `CurrentIndex`, and `CurrentIndex` is incremented.

✅ **Example Flow:**

```java
insert(10) → stored at index 0 → CurrentIndex = 1
insert(20) → stored at index 1 → CurrentIndex = 2
```

---

### 📃 toString Method

```java
public String toString() {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int i = 0; i < this.CurrentIndex; i++) {
        str.append(this.items[i]).append(", ");
    }
    str.append("\b").append("\b").append("]");
    return str.toString();
}
```

#### 📌 Purpose

- Returns a string version of the array: `[1, 2, 3]`

#### 🔍 Details

- Uses `StringBuilder` (more efficient than using `+`).
- Loops up to `CurrentIndex` to avoid printing unused values in the array.
- Removes the last `,` using backspace characters (`\b\b`).

---

### 🔎 Search Method

````java
public int Search(int value) {
    for (int i = 0; i < this.CurrentIndex; i++) {
        if (this.items[i] == value)
            return i;
    }
    return -1;
}
```markdown

#### 📌 What it does

* Searches for `value` using **linear search**.
* Returns index if found, else returns `-1`.

🧠 **Time Complexity**: O(n)

---

### ❌ RemoveAt Method (⚠️ Buggy)

```java
public void removeAt(int value) {
    if (value >= this.CurrentIndex) {
        throw new IllegalArgumentException();
    }
    for (int i = value; i <= this.CurrentIndex - 2; i++) {
        this.items[i] = this.items[i + 1];
        CurrentIndex--;
        this.items[CurrentIndex] = 0;
    }
}
````

#### ❌ What’s wrong

- `CurrentIndex--` is wrongly placed **inside the loop**, so it skips shifting some elements and shortens the array incorrectly.

✅ **Fix it like this:**

```java
public void removeAt(int index) {
    if (index >= CurrentIndex || index < 0) {
        throw new IllegalArgumentException("Invalid index");
    }
    for (int i = index; i < CurrentIndex - 1; i++) {
        items[i] = items[i + 1];
    }
    CurrentIndex--;
    items[CurrentIndex] = 0; // Optional cleanup
}
```

---

### 🔼 max Method

```java
public int max() {
    int result = this.items[0];
    for (int i = 0; i < this.CurrentIndex; i++) {
        if (items[i] > result) {
            result = items[i];
        }
    }
    return result;
}
```

- Finds the **maximum value** among inserted elements.
- Starts from `items[0]` and compares each item.
- Works only up to `CurrentIndex`.

---

### 🔽 min Method (⚠️ Buggy)

```java
public int min() {
    int result = this.items[0];
    for (int num : this.items) {
        if (result < num) {
            result = num;
        }
    }
    return result;
}
```

❌ **Bug:**

- It finds the **maximum**, not minimum. The condition is wrong.

✅ **Fix:**

```java
public int min() {
    int result = this.items[0];
    for (int i = 1; i < CurrentIndex; i++) {
        if (items[i] < result) {
            result = items[i];
        }
    }
    return result;
}
```

---

### 🔁 Reverse Method

````java
public void reverse() {
    int i = 0;
    int j = CurrentIndex - 1;
    while (i < j) {
        items[i] = items[i] ^ items[j];
        items[j] = items[i] ^ items[j];
        items[i] = items[i] ^ items[j];
        i++;
        j--;
    }
}
```maekdown

#### 📌 What it does

* Reverses the array **in-place**.
* Uses **XOR swapping** instead of a temporary variable.

📌 XOR Swap:

```java
a = a ^ b;
b = a ^ b; // b becomes a
a = a ^ b; // a becomes b
````

🧠 Works only for integers and when `i != j`.

---

## 🔹 File 2: `Main.java`

```java
package Section9_Linear_DS.CreatingOwnArrays_69;

public class Main {
    public static void main(String[] args) {
        Array arr = new Array(20);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        System.out.println(arr);
        arr.reverse();
        System.out.println(arr);
    }
}
```

### ✅ Output

```java
[1, 2, 3, 4, 5]
[5, 4, 3, 2, 1]
```

### 💡 What Happens

1. Array is created with size 20.
2. 5 values inserted: \[1, 2, 3, 4, 5]
3. `toString()` prints them.
4. `reverse()` flips it.
5. Again printed as \[5, 4, 3, 2, 1]

---

## 🧠 Summary of Methods

| Method     | Purpose                      | Time Complexity               |
| ---------- | ---------------------------- | ----------------------------- |
| insert()   | Insert value at end          | O(1) avg, O(n) worst (resize) |
| Search()   | Find index of a value        | O(n)                          |
| removeAt() | Delete value at index        | O(n)                          |
| reverse()  | Reverse array in place       | O(n)                          |
| max()      | Find max value               | O(n)                          |
| min()      | Find min value (fixed logic) | O(n)                          |

---

## ✅ Improvements You Can Add

1. **insertAt(index, value)**: Insert at any position
2. **contains(value)**: Return true/false if exists
3. **size()**: Return number of inserted elements
4. **shrink()**: Reduce array size when underused
5. **make it generic** using `<T>` instead of `int[]`
