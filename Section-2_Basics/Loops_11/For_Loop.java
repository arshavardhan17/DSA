package Loops_11;

public class For_Loop {
    public static void main(String[] args) {
        // Print numbers from 1 to 10 using a for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i);
        }

        // Print even numbers from 1 to 20 using a for loop
        System.out.println("Even numbers from 1 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even Number: " + i);
        }
    }
}
