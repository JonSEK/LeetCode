/*
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
*/

import java.util.HashMap;

public class WordPattern {
  public static void main(String[] args) {

    System.out.println(wordPattern("abba", "dog cat cat dog"));
    System.out.println(wordPattern("abba", "dog cat cat fish"));
    System.out.println(wordPattern("aaaa", "dog cat cat dog"));
  }

  public static boolean wordPattern(String pattern, String s) {
    String[] words = s.split(" ");
    if (words.length != pattern.length()) return false;
    HashMap<Character, String> map = new HashMap<>();
    for (int i = 0; i < words.length; i++) {
      char c = pattern.charAt(i);
      if (map.containsKey(c)) {
        if (!map.get(c).equals(words[i])) return false;
      } else {
        if (map.containsValue(words[i])) return false;
        map.put(c, words[i]);
      }
    }
    return true;
  }
}
