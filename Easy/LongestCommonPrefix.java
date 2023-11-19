/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as a reference
        String reference = strs[0];

        // Iterate through each character in the reference string
        for (int i = 0; i < reference.length(); i++) {
            char currentChar = reference.charAt(i);

            // Check if the current character matches the corresponding character in other strings
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    // If the characters don't match or we reach the end of a string, return the common prefix
                    return reference.substring(0, i);
                }
            }
        }

        // If all strings are identical or the array is empty, return the reference string
        return reference;
    }
}

