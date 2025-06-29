Your current Java implementation of the **naive prime-counting** approach has a few issues that need correction:

---

### ✅ Corrected Java Code

```java
package Section7_BasicMaths.SieveOfEratosthenes_61.Naive;

public class Main {

    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {  // Start from 2, not 0
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int CountPrimeNumbers(int n){
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;  // You missed this return statement
    }

    public static void main(String[] args) {
        System.out.println(CountPrimeNumbers(10)); // Expected output: 4 (primes are 2, 3, 5, 7)
    }
}
```

---

### 📝 `README.md` for Naive Prime Count (Pre-Sieve Approach)

````markdown
# 🧮 Naive Prime Counter - Java

This project demonstrates a **naive approach** to count the number of prime numbers less than a given integer `n`. Unlike the efficient Sieve of Eratosthenes, this method checks each number individually to see if it's prime.

---

## 📌 Problem Statement

Given a positive integer `n`, count how many prime numbers are less than `n`.

---

## 🧠 Naive Algorithm Logic

1. For each number `i` from 2 to `n-1`, check if `i` is prime.
2. A number is **prime** if it is only divisible by 1 and itself.
3. Return the count of prime numbers found.

---

## 📄 Code Overview (Java)

```java
public static boolean isPrime(int n){
    if (n <= 1) return false;
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

public static int CountPrimeNumbers(int n){
    int count = 0;
    for (int i = 2; i < n; i++) {
        if (isPrime(i)) {
            count++;
        }
    }
    return count;
}
```
````

---

## ✅ Sample Output

Input:

```java
CountPrimeNumbers(10);
```

Output:

```
4
```

Explanation: Prime numbers less than 10 → 2, 3, 5, 7

---

## ⏱️ Time and Space Complexity

| Metric           | Value                                        |
| ---------------- | -------------------------------------------- |
| Time Complexity  | `O(n * n/2)` or `O(n√n)` with optimized loop |
| Space Complexity | `O(1)`                                       |

---

## 🔍 Comparison with Sieve

| Method                | Time Complexity  |
| --------------------- | ---------------- |
| Naive Check           | `O(n√n)`         |
| Sieve of Eratosthenes | `O(n log log n)` |

---

## 🧑‍💻 Author

**Arsha Vardhan**

---

## 📚 References

- [Naive Prime Algorithm - GeeksForGeeks](https://www.geeksforgeeks.org/java-program-to-check-prime-number/)
- [Wikipedia - Prime number](https://en.wikipedia.org/wiki/Prime_number)

---
