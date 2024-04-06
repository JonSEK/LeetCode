/*
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.
Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example 1:
Input: nums = [1,2,2,3,1]
Output: 2
Explanation:
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
    [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.

Example 2:
Input: nums = [1,2,2,3,1,4,2]
Output: 6
Explanation:
The degree is 3 because the element 2 is repeated 3 times.
    So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
*/

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {
  public static int findShortestSubArray(int[] nums) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    Map<Integer, Integer> firstIndexMap = new HashMap<>();
    int maxFrequency = 0;
    int minLength = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

      if (!firstIndexMap.containsKey(num)) {
        firstIndexMap.put(num, i);
      }

      int frequency = frequencyMap.get(num);
      if (frequency > maxFrequency) {
        maxFrequency = frequency;
        minLength = i - firstIndexMap.get(num) + 1;
      } else if (frequency == maxFrequency) {
        minLength = Math.min(minLength, i - firstIndexMap.get(num) + 1);
      }
    }

    return minLength;
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 3, 1};
    System.out.println("Output for nums1: " + findShortestSubArray(nums1)); // Output: 2

    int[] nums2 = {1, 2, 2, 3, 1, 4, 2};
    System.out.println("Output for nums2: " + findShortestSubArray(nums2)); // Output: 6
  }
}
