/*
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them.
If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Example 2:
Input: s = "abcd", k = 2
Output: "bacd"
*/

public class ReverseStringII {
  public static void main(String[] args) {
    String s = "abcdefg";
    int k = 2;
    System.out.println(reverseStr(s, k));
  }

  public static String reverseStr(String s, int k) {
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i += 2 * k) {
      int left = i;
      int right = Math.min(i + k - 1, arr.length - 1);
      while (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
    return new String(arr);
  }
}
