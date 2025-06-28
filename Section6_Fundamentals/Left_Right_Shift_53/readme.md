Here’s a complete and clean `README.md` focused specifically on **Left Shift (`<<`)** and **Right Shift (`>>`, `>>>`)** operators in Java. It includes definitions, examples, binary explanations, and practical use cases.

---

```markdown
# 🔄 Left Shift and Right Shift Operators in Java

This repository explains the **Left Shift (`<<`)**, **Signed Right Shift (`>>`)**, and **Unsigned Right Shift (`>>>`)** operators in Java with examples and real-world use cases.

---

## 📘 Table of Contents

- [Introduction](#introduction)
- [Left Shift `<<`](#left-shift-)
- [Right Shift `>>`](#signed-right-shift-)
- [Unsigned Right Shift `>>>`](#unsigned-right-shift-)
- [Binary Visual Examples](#binary-visual-examples)
- [Use Cases](#use-cases)
- [Java Code Examples](#java-code-examples)
- [Project Structure](#project-structure)
- [License](#license)

---

## 📖 Introduction

Shift operators in Java work by **shifting the bits** of a number to the left or right. These operations are very fast and useful in bit manipulation, mathematical optimization, and systems programming.

---

## ⏩ Left Shift `<<`

The **left shift operator** moves all bits to the left and fills the empty rightmost bits with zeros.

### Formula:
```

a << n ≡ a × 2ⁿ

````

### Example:
```java
int a = 5;         // 0000 0101
int result = a << 1; // 0000 1010 = 10
````

---

## ⏪ Signed Right Shift `>>`

The **signed right shift operator** moves all bits to the right while preserving the sign (leftmost bit remains the same).

### Formula:

```
a >> n  ≡  a / 2ⁿ
```

### Example:

```java
int a = 10;        // 0000 1010
int result = a >> 1; // 0000 0101 = 5
```

For negative numbers:

```java
int a = -8;        // 1111 1000
int result = a >> 1; // 1111 1100 = -4
```

---

## 🧼 Unsigned Right Shift `>>>`

The **unsigned right shift operator** moves all bits to the right and fills leftmost bits with `0` regardless of sign.

### Example:

```java
int a = -8;           // 1111 1000 (in 32 bits)
int result = a >>> 1; // 0111 1100 (fills left with 0) = 2147483644
```

---

## 📊 Binary Visual Examples

| Operation  | Binary Before | Binary After | Decimal Result |
| ---------- | ------------- | ------------ | -------------- |
| `5 << 1`   | `0000 0101`   | `0000 1010`  | 10             |
| `10 >> 1`  | `0000 1010`   | `0000 0101`  | 5              |
| `-8 >> 1`  | `1111 1000`   | `1111 1100`  | -4             |
| `-8 >>> 1` | `1111 1000`   | `0111 1100`  | 2147483644     |

---

## 🛠️ Use Cases

- **Multiplication / Division by Powers of Two**
- **Efficient Bit Manipulation**
- **Binary Encoding and Decoding**
- **Compression Algorithms**
- **Image Processing**
- **Hashing Functions**

---

## 💡 Java Code Examples

```java
public class ShiftOperators {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Left Shift: 5 << 1 = " + (a << 1)); // 10

        int b = 10;
        System.out.println("Right Shift: 10 >> 1 = " + (b >> 1)); // 5

        int c = -8;
        System.out.println("Signed Right Shift: -8 >> 1 = " + (c >> 1)); // -4
        System.out.println("Unsigned Right Shift: -8 >>> 1 = " + (c >>> 1)); // 2147483644
    }
}
```

---

## 🧑‍💻 Project Structure

```
shift-operators-java/
├── src/
│   └── ShiftOperators.java
├── README.md
└── LICENSE
```
