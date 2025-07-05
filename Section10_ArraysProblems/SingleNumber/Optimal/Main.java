package Section10_ArraysProblems.SingleNumber.Optimal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        Sc.close();
        int ans = 0;
        for (int num : arr) {
            ans = ans ^ num; // ^ retuns 0 if both the numbers are same 2^2=0
        }
        System.out.println(ans);

    }

}
// T.C=O(n)
// S.C=O(n)