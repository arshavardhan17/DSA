package Section6_Fundamentals.Binary_To_Decimal_56;

import java.util.*;

// System.out.println(1532%10);-->gives you last number
// System.out.println(1532/10);-->gives you everything except last number
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int binary = Sc.nextInt();
        Sc.close();
        int result = 0;
        int index = 0;
        while (binary != 0) {
            int lastBit = binary % 10;
            if (lastBit == 1) {
                result = result + (int) Math.pow(2, index);
            }
            index++;
            binary = binary / 10;
        }
        System.out.println(result);

    }
}
