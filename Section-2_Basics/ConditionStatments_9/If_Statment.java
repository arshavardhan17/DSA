package ConditionStatments_9;

public class If_Statment {
    public static void main(String[] args) {
        int number = 10;

        // If statement to check if the number is positive
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // If-else statement to check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Nested if statement to check if the number is positive and even
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is positive and even.");
            }
        }
    }
}
