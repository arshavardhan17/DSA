package Section10_ArraysProblems.SingleNumber.Naive;

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
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j] && i != j && arr[i] != -1) {
                    arr[i] = -1;
                    arr[j] = -1;// it we find more then 1 make them -1

                }
            }
            if (arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }
    }
}
