package Section7_Maths.PrimeNumbersUpto_n_61.Effective;

public class Sieve_of_Eratosthenes {
    public static void sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        // Step 1: Assume all numbers are prime
        for (int i = 2; i <= n; i++) { // Arrays.fill(isPrime,true)
            isPrime[i] = true; // isPrime[0]=false
        } // isPrime[1]=false

        // Step 2: Mark multiples of each prime
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
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