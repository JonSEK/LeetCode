/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
*/

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are different, they can't be isomorphic
        }
        
        HashMap<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);

            if (mapping.containsKey(char1)) {
                // If char1 is already mapped, check if it is mapped to the same character in str2
                if (mapping.get(char1) != char2) {
                    return false;
                }
            } else {
                // If char1 is not yet mapped, check if char2 is already used by another character
                if (mapping.containsValue(char2)) {
                    return false;
                }
                // Map char1 to char2
                mapping.put(char1, char2);
            }
        }
        return true;
    }
}
