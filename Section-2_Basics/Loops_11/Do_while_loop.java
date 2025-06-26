package Loops_11;

public class Do_while_loop {
    public static void main(String[] args) {
        int i = 1;

        // Print numbers from 1 to 10 using a do-while loop
        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 10);

        // Print even numbers from 1 to 20 using a do-while loop
        System.out.println("Even numbers from 1 to 20:");
        i = 2;
        do {
            System.out.println("Even Number: " + i);
            i += 2;
        } while (i <= 20);
    }
}
