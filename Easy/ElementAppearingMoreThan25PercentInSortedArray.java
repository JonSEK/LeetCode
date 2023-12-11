/*
Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.
Example 1:
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6

Example 2:
Input: arr = [1,1]
Output: 1
*/

import java.util.HashMap;
import java.util.Map;

public class ElementAppearingMoreThan25PercentInSortedArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int[] array2 = {1, 3, 5, 7, 9, 1, 3, 5, 7};
        System.out.println(findSpecialInteger(array1));
        System.out.println(findSpecialInteger(array2));
    }

    public static int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentNum = 0;
        int maxFrequency = 0;

        // Find the most frequent element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                mostFrequentNum = num;
                maxFrequency = frequency;
            }
        }

        return mostFrequentNum;
    }
}
