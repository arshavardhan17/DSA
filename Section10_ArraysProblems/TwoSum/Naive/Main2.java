package Section10_ArraysProblems.TwoSum.Naive;

public class Main2 {
    public int[] TwoSum(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size - 1; i++) {
            int targetNumber = target - nums[i]; // search number =target-arr[i]
            for (int j = i + 1; j < size; j++) { // linear search
                if (nums[j] == targetNumber) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
/*
 * i = 0 → j = 1, 2, 3
 * i = 1 → j = 2, 3
 * i = 2 → j = 3 ✅ (this finds [2,3])
 */
