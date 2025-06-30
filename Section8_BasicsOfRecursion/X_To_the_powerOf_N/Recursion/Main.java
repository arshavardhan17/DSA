package Section8_BasicsOfRecursion.X_To_the_powerOf_N.Recursion;

//Task: take two inputs x and n and find x^n using iterative and recursive methods 
public class Main {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(3, 3));
    }
}
