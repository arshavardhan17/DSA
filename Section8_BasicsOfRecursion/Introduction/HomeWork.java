package Section8_BasicsOfRecursion.Introduction;
//Task:to print the numbers from n to 1 using recursion

public class HomeWork {
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        print(n - 1);
    }

    public static void main(String[] args) {
        print(5);
    }
}
