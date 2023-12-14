/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true

Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true

Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Create a HashMap to store the element and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the HashMap and the absolute difference
            // between the current index and the previous index is at most k, return true
            if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k) {
                return true;
            }

            // Update the index of the current element in the HashMap
            map.put(nums[i], i);
        }

        // If no such indices are found, return false
        return false;
    }
}
