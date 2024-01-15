/*
Given an integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.
All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.
Note: You are not allowed to use any built-in library method to directly solve this problem.

Example 1:
Input: num = 26
Output: "1a"

Example 2:
Input: num = -1
Output: "ffffffff"
*/

public class ConvertANumberToHexadecimal {
  public static void main(String[] args) {
    System.out.println(toHex(26));
    System.out.println(toHex(-1));
  }

  public static String toHex(int num) {
    if (num == 0) {
      return "0";
    }
    StringBuilder sb = new StringBuilder();
    while (num != 0) {
      int digit = num & 15;
      sb.append(digit < 10 ? (char) (digit + '0') : (char) (digit - 10 + 'a'));
      num >>>= 4;
    }
    return sb.reverse().toString();
  }
}
