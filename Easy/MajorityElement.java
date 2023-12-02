/*
Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each item in the array
        for (int item : nums) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        // Find the item with the maximum frequency
        int mostCommonItem = -1;
        int maxFrequency = -1;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostCommonItem = entry.getKey();
            }
        }
        return mostCommonItem;
    }
}
