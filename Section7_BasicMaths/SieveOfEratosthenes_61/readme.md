# 🧮 Sieve of Eratosthenes

The **Sieve of Eratosthenes** is an ancient algorithm used to find all prime numbers up to a given limit `n`. It is highly efficient for generating a list of primes and is based on the principle of eliminating the multiples of each prime number starting from 2.

---

## 📌 Problem Statement

Given an integer `n`, return all prime numbers less than or equal to `n` using the **Sieve of Eratosthenes** algorithm.

---

## 🧠 Algorithm Explanation

1. Create a boolean array `isPrime[]` of size `n + 1` and initialize all entries as `true`.
2. Starting from `p = 2`, mark all multiples of `p` as `false`.
3. Repeat the process for the next `p` which is still `true`.
4. Finally, the indices with `true` values in the array are the prime numbers.

---

## 📦 Project Structure

```

SieveOfEratosthenes/
├── src/
│ └── Main.java
├── README.md

```

---

## 📄 Code Example (Java)

```java
public class Main {
    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        // Step 1: Assume all numbers are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Step 2: Mark multiples of each prime
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Step 3: Print primes
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50; // Example input
        sieveOfEratosthenes(n);
    }
}
```

---

## 🕒 Time and Space Complexity

| Complexity | Value            |
| ---------- | ---------------- |
| ⏱️ Time    | `O(n log log n)` |
| 💾 Space   | `O(n)`           |

---

## ✅ Sample Output

For `n = 50`:

```
Prime numbers up to 50 are:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
```

## 📚 References

- [Wikipedia - Sieve of Eratosthenes](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
- [GeeksForGeeks - Sieve Algorithm](https://www.geeksforgeeks.org/sieve-of-eratosthenes/)

---

## 🧑‍💻 Author

**Arsha Vardhan**
