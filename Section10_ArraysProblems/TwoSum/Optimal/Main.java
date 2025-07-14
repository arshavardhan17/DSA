package Section10_ArraysProblems.TwoSum.Optimal;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int[] TwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int targetNumber = target - nums[i];
            if (map.containsKey(targetNumber)) {
                return new int[] { map.get(targetNumber), i };
            }
            map.put(nums[i], i);
        }

        // If no solution is found
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = TwoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
