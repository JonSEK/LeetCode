/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
*/

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 2, 6, 7, 8}));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            // If the number is already in the set, it's a duplicate
            if (!uniqueSet.add(num)) {
                return true;
            }
        }
        // No duplicates found
        return false;
    }
}
