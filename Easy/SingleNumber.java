/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
*/

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int item : nums) {
            result ^= item;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 2, 1, 2, 3, 5, 5};
        int singleNumber = singleNumber(numbers);
        System.out.println(singleNumber);
    }
}
