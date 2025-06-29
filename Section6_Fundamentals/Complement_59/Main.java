package Section6_Fundamentals.Complement_59;

public class Main {

    // Method to find the bitwise complement of a number
    public static int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }

        int number = n; // Copy of n
        int mask = 0;

        // Create a mask with all bits set to 1 (same number of bits as n)
        while (number != 0) {
            mask = (mask << 1) | 1;
            number = number >> 1;
        }

        // XOR with mask flips all bits of n
        return n ^ mask;
    }

    public static void main(String[] args) {
        int result = bitwiseComplement(5);
        System.out.println("Bitwise complement of 5 is: " + result);
    }
}
