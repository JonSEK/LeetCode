/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
*/

public class RansomNote {
  public static void main(String[] args) {
    System.out.println(canConstruct("a", "b"));
    System.out.println(canConstruct("aa", "ab"));
    System.out.println(canConstruct("aa", "aab"));
  }
  
  public static boolean canConstruct(String ransomNote, String magazine) {
    int[] letters = new int[26];
    for (int i = 0; i < magazine.length(); i++) {
      letters[magazine.charAt(i) - 'a']++;
    }
    for (int i = 0; i < ransomNote.length(); i++) {
      if (--letters[ransomNote.charAt(i) - 'a'] < 0) {
        return false;
      }
    }
    return true;
  }
}
