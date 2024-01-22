/*
You have a set of integers s, which originally contains all the numbers from 1 to n.
Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]
*/

public class SetMismatch {
  public static void main(String[] args) {
    int[] nums = {1, 2, 2, 4};
    int[] result = findErrorNums(nums);
    for (int i : result) {
      System.out.println(i);
    }
  }

  public static int[] findErrorNums(int[] nums) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      int index = Math.abs(nums[i]) - 1;
      if (nums[index] < 0) {
        result[0] = index + 1;
      } else {
        nums[index] = -nums[index];
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        result[1] = i + 1;
      }
    }
    return result;
  }
}
