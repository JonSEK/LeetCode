/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

Example 1:
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

Example 2:
Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
*/

public class LongestPalindrome {
  public static void main(String[] args) {
    System.out.println(longestPalindrome("abccccdd"));
    System.out.println(longestPalindrome("a"));
  }

  public static int longestPalindrome(String s) {
    int[] charCount = new int[128];
    int longestPalindrome = 0;
    for (char c : s.toCharArray()) {
      charCount[c]++;
      if (charCount[c] == 2) {
        longestPalindrome += 2;
        charCount[c] = 0;
      }
    }
    return longestPalindrome == s.length() ? longestPalindrome : longestPalindrome + 1;
  }
}
