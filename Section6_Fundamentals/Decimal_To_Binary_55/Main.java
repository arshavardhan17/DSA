package Section6_Fundamentals.Decimal_To_Binary_55;

import java.util.Scanner;

//Task:change the  dcimal number to binary using bitwise
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();

        String count = ""; // int count =0;
        while (num > 0) {
            int lastBit = num & 1;
            count = count + lastBit; // count=count*10+lastbit
            num = num >> 1;
        }
        System.out.println(count);
        Sc.close();
    }
}
// use strinng if we use int if we get 0 at bigining it wont count