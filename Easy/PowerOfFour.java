/*
Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true
*/

public class PowerOfFour {
  public static void main(String[] args) {
    System.out.println(isPowerOfFour(16));
    System.out.println(isPowerOfFour(5));
    System.out.println(isPowerOfFour(1));
  }

  public static boolean isPowerOfFour(int n) {
    if (n == 0) return false;
    while (n % 4 == 0) {
      n /= 4;
    }
    return n == 1;
  }
}
