package Section6_Fundamentals.NumberSystem_51;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        String result = " ";
        while (a > 0) {
            int remainder = a % 2;
            a = a / 2;
            result = remainder + result; // reverse the answer
        }
        System.out.println(result);
        Sc.close();
    }

}
