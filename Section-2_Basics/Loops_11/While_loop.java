package Loops_11;

public class While_loop {
    public static void main(String[] args) {
        int i = 1;

        // Print numbers from 1 to 10 using a while loop
        while (i <= 10) {
            System.out.println("Number: " + i);
            i++;
        }

        // Print even numbers from 1 to 20 using a while loop
        System.out.println("Even numbers from 1 to 20:");
        i = 2;
        while (i <= 20) {
            System.out.println("Even Number: " + i);
            i += 2;
        }
    }
}
