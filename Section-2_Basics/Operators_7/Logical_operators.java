package Operators_7;

public class Logical_operators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean andResult = a && b;
        System.out.println("Logical AND: " + andResult); // false

        // Logical OR
        boolean orResult = a || b; //if thr first operand is true, the second operand is not evaluated
        System.out.println("Logical OR: " + orResult); // true

        // Logical NOT
        boolean notResult = !a;
        System.out.println("Logical NOT: " + notResult); // false
    }
}
