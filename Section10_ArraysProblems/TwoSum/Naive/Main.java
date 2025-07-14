package Section10_ArraysProblems.TwoSum.Naive;

//Two pointer approch
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int target = Sc.nextInt();
        int n = Sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        Sc.close();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) { // j = i + 1
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);
                    return; // stop after first match (optional)
                }
            }
        }
    }
}
