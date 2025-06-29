Here's a complete `README.md` for **"Power of Two using Bitwise Operators"** — perfect for your GitHub project:

---

```markdown
# 🔢 Power of Two Using Bitwise Operators in Java

This project demonstrates how to check if a number is a power of two using efficient **bitwise operations** in Java.

## 🚀 What is a Power of Two?

A number is a **power of two** if it has only one bit set in its binary representation.

Examples:

- 1 → `0001` (2⁰)
- 2 → `0010` (2¹)
- 4 → `0100` (2²)
- 8 → `1000` (2³)
- ...and so on.

## 🧠 Bitwise Insight

A number `n` is a power of two **if and only if**:
```

n > 0 && (n & (n - 1)) == 0

````

### Why it works:
- `n` in binary has only **one set bit**.
- `n - 1` flips all bits after the rightmost set bit (including it).
- Doing `n & (n - 1)` removes that only set bit — result is `0`.

---

## 💻 Java Code Example

```java
public class PowerOfTwoChecker {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 3, 4, 5, 8, 16, 18, 32, 64, 100};

        for (int num : testNumbers) {
            System.out.printf("%d is %sa power of two.%n",
                    num, isPowerOfTwo(num) ? "" : "not ");
        }
    }
}
````

---

## 🧪 Output

```
1 is a power of two.
2 is a power of two.
3 is not a power of two.
4 is a power of two.
5 is not a power of two.
8 is a power of two.
16 is a power of two.
18 is not a power of two.
32 is a power of two.
64 is a power of two.
100 is not a power of two.
```

---

## ⚙️ Complexity

| Operation     | Time Complexity | Space Complexity |
| ------------- | --------------- | ---------------- |
| Bitwise check | O(1)            | O(1)             |

## 📌 Fun Fact

The same technique is used in compilers and embedded systems for performance-critical code where checking power-of-two values is essential (e.g., memory alignment, buffer sizes, etc.)

## 🙌 Contributions

Feel free to fork, star, or open an issue or PR!
Let’s keep learning bitwise magic together! 🔥

---

## 🖼️ Visualization

Here’s how it works with a binary example:

```
n = 8 → 1000
n - 1 = 7 → 0111
-----------------
n & (n-1) = 0000 ✅
```
