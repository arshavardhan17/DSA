package Section6_Fundamentals.PowerOfTwo_58;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        Sc.close();
        if(n<=0){
          System.out.println("is not power of 2");
        }
        while(n!=0){
            int lastBit =n&1;
            n=n>>1;
            if(lastBit ==1&&n!=0){
                System.out.println("is nat a power of 2");
            }
        }
        System.out.println("is a power of 2");
    }
}




/*
 * public class PowerOfTwoChecker {

    // This method checks if a number is a power of two
    public static boolean isPowerOfTwo(int number) {
        // If number is less than or equal to 0, it's not a power of two
        if (number <= 0) {
            return false;
        }

        // Bitwise trick: power of two has only one set bit
        return (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {
        // Array of test numbers
        int[] numbers = {1, 2, 3, 4, 5, 8, 16, 18, 32, 64, 100};

        // Check each number and print result
        for (int num : numbers) {
            if (isPowerOfTwo(num)) {
                System.out.println(num + " is a power of two.");
            } else {
                System.out.println(num + " is NOT a power of two.");
            }
        }
    }
}

 */