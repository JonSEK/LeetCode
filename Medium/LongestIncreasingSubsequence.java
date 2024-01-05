/*
Given an integer array nums, return the length of the longest strictly increasing subsequence.

Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.

Example 2:
Input: nums = [0,1,0,3,2,3]
Output: 4

Example 3:
Input: nums = [7,7,7,7,7,7,7]
Output: 1
*/

public class LongestIncreasingSubsequence {
  public static void main(String[] args) {
    System.out.println(lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    System.out.println(lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    System.out.println(lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
  }

  public static int lengthOfLIS(int[] nums) {
    int[] dp = new int[nums.length];
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      int maxVal = 0;
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          maxVal = Math.max(maxVal, dp[j]);
        }
      }
      dp[i] = maxVal + 1;
      max = Math.max(max, dp[i]);
    }
    return max;
  }
}
