/*
You have n coins and you want to build a staircase with these coins.
The staircase consists of k rows where the ith row has exactly i coins.
The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.

Example 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Example 2:
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
*/

public class ArrangingCoins {
  public static void main(String[] args) {
    System.out.println(arrangeCoins(5));
    System.out.println(arrangeCoins(8));
  }

  public static int arrangeCoins(int n) {
    int count = 0;
    while (n > 0) {
      count++;
      n -= count;
    }
    return n == 0 ? count : count - 1;
  }
}
