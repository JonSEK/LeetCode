/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
  public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    int[] result = intersection(nums1, nums2);
    for (int j : result) {
      System.out.print(j + " ");
    }
    System.out.print("\n");
  }

  public static int[] intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    Set<Integer> intersect = new HashSet<>();
    for (int j : nums1) {
      set.add(j);
    }
    for (int j : nums2) {
      if (set.contains(j)) {
        intersect.add(j);
      }
    }
    int[] result = new int[intersect.size()];
    int i = 0;
    for (Integer num : intersect) {
      result[i++] = num;
    }
    return result;
  }
}
