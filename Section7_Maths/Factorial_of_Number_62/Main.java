package Section7_Maths.Factorial_of_Number_62;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();
        Sc.close();
        int result = 1;

        for (int i = num; i >= 1; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
// WE CAN SOLVE THIS EFECTIVELY USING RECURSION

// For 15 int value excedes so use thes
/*
 * public class Factorial {
 * public static long factorial(int n) {
 * long result = 1;
 * for (int i = 2; i <= n; i++) {
 * result *= i;
 * }
 * return result;
 * }
 * 
 * public static void main(String[] args) {
 * int number = 5;
 * System.out.println("Factorial of " + number + " is: " + factorial(number));
 * }
 * }
 * 
 */