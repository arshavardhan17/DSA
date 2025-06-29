package Section7_BasicMaths.SieveOfEratosthenes_61.Naive;
//Task:Given an integer n, return the number of prime numbers that are strictly less than n.
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
        return count;  
    }

    public static void main(String[] args) {
        System.out.println(CountPrimeNumbers(10)); // Expected output: 4 (primes are 2, 3, 5, 7)
    }
}
