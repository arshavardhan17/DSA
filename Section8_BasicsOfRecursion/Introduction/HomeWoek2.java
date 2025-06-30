package Section8_BasicsOfRecursion.Introduction;

//Task: print the sum of numbers from 1 to n using recursion
public class HomeWoek2 {
    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Sum(9));
    }
}
