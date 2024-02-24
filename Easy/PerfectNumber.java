/*
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
A divisor of an integer x is an integer that can divide x evenly.
Given an integer n, return true if n is a perfect number, otherwise return false.

Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.

Example 2:
Input: num = 7
Output: false
*/

public class PerfectNumber {
  public static void main(String[] args) {
    System.out.println(checkPerfectNumber(28));
    System.out.println(checkPerfectNumber(7));
  }

  public static boolean checkPerfectNumber(int num) {
    if (num == 1) {
      return false;
    }
    int sum = 1;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        sum += i;
        if (i != num / i) {
          sum += num / i;
        }
      }
    }
    return sum == num;
  }
}
