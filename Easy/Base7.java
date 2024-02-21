/*
Given an integer num, return a string of its base 7 representation.

Example 1:
Input: num = 100
Output: "202"

Example 2:
Input: num = -7
Output: "-10"
*/

public class Base7 {
  public static void main(String[] args) {
    int num = 100;
    System.out.println(convertToBase7(num));
  }

  public static String convertToBase7(int num) {
    if (num == 0) {
      return "0";
    }
    StringBuilder sb = new StringBuilder();
    boolean isNegative = num < 0;
    if (isNegative) {
      num = -num;
    }
    while (num > 0) {
      sb.append(num % 7);
      num /= 7;
    }
    if (isNegative) {
      sb.append("-");
    }
    return sb.reverse().toString();
  }
}
