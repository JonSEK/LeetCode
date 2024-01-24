/*
Given an integer array nums, return the third distinct maximum number in this array.
If the third maximum does not exist, return the maximum number.

Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
*/

public class ThirdMaximumNumber {
  public static int thirdMax(int[] nums) {
    Integer max = null;
    Integer secondMax = null;
    Integer thirdMax = null;

    for (Integer num : nums) {
      if (num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
        continue;
      }

      if (max == null || num > max) {
        thirdMax = secondMax;
        secondMax = max;
        max = num;
      } else if (secondMax == null || num > secondMax) {
        thirdMax = secondMax;
        secondMax = num;
      } else if (thirdMax == null || num > thirdMax) {
        thirdMax = num;
      }
    }
    if (thirdMax == null) {
      return max;
    }
    return thirdMax;
  }
}
