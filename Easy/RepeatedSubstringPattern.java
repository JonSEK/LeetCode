/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:
Input: s = "aba"
Output: false

Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
*/

public class RepeatedSubstringPattern {
  public static void main(String[] args) {
    String s = "abab";
    System.out.println(repeatedSubstringPattern(s));
  }

  public static boolean repeatedSubstringPattern(String s) {
    int len = s.length();
    for (int i = len / 2; i >= 1; i--) {
      if (len % i == 0) {
        int m = len / i;
        String sub = s.substring(0, i);
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < m; j++) {
          sb.append(sub);
        }
        if (sb.toString().equals(s)) {
          return true;
        }
      }
    }
    return false;
  }
}
