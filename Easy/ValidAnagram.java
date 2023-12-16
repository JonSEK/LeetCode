/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false*/

public class ValidAnagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("anagram", "nagaram"));
  }

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] charFrequency = new int[26]; // Assuming only lowercase English letters

    // Increment character counts for string s
    for (char c : s.toCharArray()) {
      charFrequency[c - 'a']++;
    }

    // Decrement character counts for string t
    for (char c : t.toCharArray()) {
      charFrequency[c - 'a']--;

      // If the count becomes negative, strings are not anagrams
      if (charFrequency[c - 'a'] < 0) {
        return false;
      }
    }

    // If all character counts are zero, strings are anagrams
    return true;
  }
}