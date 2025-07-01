# 📚 Arrays in Data Structures (Java Focused)

Arrays are the most fundamental data structures in computer science. This README is a comprehensive guide that explains arrays with theory, operations, code examples in Java, and real-world applications.

---

## 📌 What is an Array?

An **Array** is a data structure that stores a fixed-size sequence of elements of the same data type. Each element is accessed by its **index** (starting from 0).

---

## ⚙️ Characteristics

- Fixed size (defined at creation)
- Contiguous memory allocation
- Allows random access using indices
- Elements must be of the same data type

---

## 🧠 Array Declaration & Initialization in Java

```java
// Declaration
int[] numbers;
String[] names;

// Initialization
numbers = new int[5];  // creates an array of size 5

// Declaration + Initialization
int[] primes = {2, 3, 5, 7, 11};
```

---

## ⚙️ Time Complexities

| Operation           | Time Complexity | Notes                               |
| ------------------- | --------------- | ----------------------------------- |
| Access by Index     | O(1)            | Constant time using index           |
| Search by Value     | O(n)            | Linear search                       |
| Insertion at End    | O(1)            | Only if space available             |
| Insertion at Start  | O(n)            | Requires shifting elements          |
| Insertion at Middle | O(n)            | Requires shifting elements          |
| Deletion at End     | Θ(1)            | Best case, no shifting              |
| Deletion at Start   | O(n)            | Worst case, shift all elements left |
| Deletion at Middle  | Ω(n/2)          | Average case, shift half elements   |

---

## 🔍 Searching Elements

### 🔹 Lookup by Index → `O(1)`

```java
int[] arr = {10, 20, 30, 40};
System.out.println(arr[2]); // Output: 30
```

### 🔹 Lookup by Value → `O(n)` (Linear Search)

```java
int target = 30;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println("Found at index: " + i);
    }
}
```

---

## ❌ Deletion in Arrays

Deletion requires shifting elements if it's not from the end:

| Position       | Time Complexity | Description                    |
| -------------- | --------------- | ------------------------------ |
| Last Element   | Θ(1)            | No shifting needed (Best Case) |
| First Element  | O(n)            | All elements must be shifted   |
| Middle Element | Ω(n/2)          | Half of the elements shifted   |

```java
// Deleting an element at index i
for (int j = i; j < arr.length - 1; j++) {
    arr[j] = arr[j + 1];
}
```

---

## ✨ Code Examples

### 1. Traverse an Array

```java
int[] arr = {1, 2, 3, 4, 5};
for(int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

### 2. Find Maximum Element

```java
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

### 3. Linear Search

```java
int target = 7;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println("Found at index: " + i);
    }
}
```

---

## 🔄 Multi-Dimensional Arrays

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Access element at 2nd row and 3rd column
System.out.println(matrix[1][2]);  // Output: 6
```

---

## 💡 Applications of Arrays

- Implementing other data structures (Stacks, Queues, Hash Tables)
- Storing data in matrix or tabular formats
- Dynamic Programming (DP arrays)
- Image and signal processing

---

## 🔍 Advanced Topics

### 🔁 Array Rotations

```java
// Rotate array to the left by 1
int temp = arr[0];
for (int i = 1; i < arr.length; i++) {
    arr[i - 1] = arr[i];
}
arr[arr.length - 1] = temp;
```

### 📈 Sorting Arrays

```java
Arrays.sort(arr);  // Uses Dual-Pivot Quicksort for primitives
```

### 🔂 Reverse an Array

```java
for (int i = 0; i < arr.length / 2; i++) {
    int temp = arr[i];
    arr[i] = arr[arr.length - 1 - i];
    arr[arr.length - 1 - i] = temp;
}
```

---

## 🧪 Useful Java Array Methods

```java
Arrays.toString(arr);
Arrays.sort(arr);
Arrays.binarySearch(arr, key);
Arrays.copyOf(arr, newLength);
Arrays.equals(arr1, arr2);
```

## 🧨 Java Array Power Tips & Shortcuts

### 🔸 1. Use `for-each` Loop (Enhanced for loop)

Avoid index-based loops if you don’t need the index.

```java
int[] arr = {1, 2, 3, 4};
for (int num : arr) {
    System.out.println(num);
}
```

---

### 🔸 2. Quickly Print Array Contents

```java
System.out.println(Arrays.toString(arr));  // instead of manual loop
```

---

### 🔸 3. Fill an Array with a Value

```java
Arrays.fill(arr, 100);  // Fills every element with 100
```

---

### 🔸 4. Copying Arrays (Fast Way)

```java
int[] copy = Arrays.copyOf(arr, arr.length);  // Deep copy
```

For partial copy:

```java
int[] first3 = Arrays.copyOfRange(arr, 0, 3);  // Copy first 3 elements
```

---

### 🔸 5. Multi-D Array with Different Row Sizes (Jagged Arrays)

```java
int[][] jagged = new int[3][];
jagged[0] = new int[2];
jagged[1] = new int[4];
jagged[2] = new int[1];
```

---

### 🔸 6. Clone Arrays

```java
int[] clone = arr.clone();  // Same as copyOf
```

---

### 🔸 7. Shortcut to Sort in Descending Order

```java
Integer[] arr = {5, 2, 9, 1};
Arrays.sort(arr, Collections.reverseOrder());
```

Note: Works only with `Integer[]`, not `int[]`.

---

### 🔸 8. Parallel Sort (Faster for Large Arrays)

```java
Arrays.parallelSort(arr);  // Uses multiple threads (for huge arrays)
```

---

### 🔸 9. Binary Search

```java
int pos = Arrays.binarySearch(arr, 5);  // Returns index of 5, or (-(insertion point)-1) if not found
```

⚠️ Make sure the array is **sorted** before using it.

---

### 🔸 10. Compare Arrays

```java
Arrays.equals(arr1, arr2);  // Returns true if elements match
```

---

## 🧵 Array vs ArrayList (Bonus)

| Feature     | Array              | ArrayList     |
| ----------- | ------------------ | ------------- |
| Size        | Fixed              | Dynamic       |
| Type        | Primitive & Object | Object only   |
| Performance | Faster             | Slower        |
| Memory      | Less overhead      | More overhead |

---

## 🧠 Practice Problems (Suggested)

- [ ] Reverse an array
- [ ] Find missing number in a range
- [ ] Kadane’s Algorithm (Max subarray sum)
- [ ] Merge two sorted arrays
- [ ] Find duplicates in array

---

## 📚 References

- [Oracle Java Docs: Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [GeeksforGeeks - Arrays](https://www.geeksforgeeks.org/arrays-in-java/)
- [LeetCode Array Problems](https://leetcode.com/tag/array/)

---

## 🧑‍💻 Author

**Arsha Vardhan**
GitHub: [@arshavardhan](https://github.com/arshavardhan)
Feel free to contribute or fork the repository ✨

---
