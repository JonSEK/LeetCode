/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0
*/

public class AddDigits {
  public static void main(String[] args) {
    System.out.println(addDigits(38));
  }

  public static int addDigits(int num) {
    if (num < 10) {
      return num;
    }

    // Convert the number to a string
    String numberAsString = Integer.toString(num);

    // Split the string into an array of characters
    char[] digits = numberAsString.toCharArray();

    // Sum the digits
    int sum = 0;
    for (char digit : digits) {
      // Convert each character back to its numeric value
      int numericDigit = Character.getNumericValue(digit);

      // Add the numeric value to the sum
      sum += numericDigit;
    }

    // Recursive call with the new sum
    return addDigits(sum);
  }
}
