package Operators_7;

public class Comparable_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Greater than
        boolean isAGreaterThanB = a > b;
        System.out.println("Is a greater than b? " + isAGreaterThanB); // false

        // Less than
        boolean isALessThanB = a < b;
        System.out.println("Is a less than b? " + isALessThanB); // true

        // Greater than or equal to
        boolean isAGreaterThanOrEqualToB = a >= b;
        System.out.println("Is a greater than or equal to b? " + isAGreaterThanOrEqualToB); // false

        // Less than or equal to
        boolean isALessThanOrEqualToB = a <= b;
        System.out.println("Is a less than or equal to b? " + isALessThanOrEqualToB); // true

        // Equal to
        boolean isAEqualToB = a == b;
        System.out.println("Is a equal to b? " + isAEqualToB); // false

        // Not equal to
        boolean isANotEqualToB = a != b;
        System.out.println("Is a not equal to b? " + isANotEqualToB); // true
    }
}
