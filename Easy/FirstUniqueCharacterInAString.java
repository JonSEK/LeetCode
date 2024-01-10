/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
*/

public class FirstUniqueCharacterInAString {
  public static void main(String[] args) {
    System.out.println(firstUniqChar("leetcode"));
    System.out.println(firstUniqChar("loveleetcode"));
    System.out.println(firstUniqChar("aabb"));
  }

  public static int firstUniqChar(String s) {
    int[] letters = new int[26];
    for (int i = 0; i < s.length(); i++) {
      letters[s.charAt(i) - 'a']++;
    }
    for (int i = 0; i < s.length(); i++) {
      if (letters[s.charAt(i) - 'a'] == 1) {
        return i;
      }
    }
    return -1;
  }
}
