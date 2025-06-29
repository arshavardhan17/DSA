package Section6_Fundamentals.CountingBits_54;
/*
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
Example 1:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

 */
class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            int count = 0;
            int x = i;
            while (x > 0) {
                int lastBit= x & 1; 
                if(lastBit ==1){
                    count++;
                } 
                x = x >> 1;      
            }
            arr[i] = count;
        }
        
        return arr;
    }
}
