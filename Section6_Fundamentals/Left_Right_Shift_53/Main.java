package Section6_Fundamentals.Left_Right_Shift_53;

import java.util.Scanner;

//Task:Find the number of 1's in the binary of the number
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int result = 0;
        int n = Sc.nextInt();
        while (n > 0) {
            int lastDigit = n & 1;
            if (lastDigit == 1) {
                result++;
            }
            n = n >> 1;
        }
        System.out.println(result);

        Sc.close();
    }
}
