/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1:
Input: s = "hello"
Output: "holle"

Example 2:
Input: s = "leetcode"
Output: "leotcede"
*/

public class ReverseVowelsOfAString {
  public static void main(String[] args) {
    ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
    System.out.println(solution.reverseVowels("hello"));
    System.out.println(solution.reverseVowels("leetcode"));
  }

  private boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' ||
        c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' ||
        c == 'U';
  }

  public String reverseVowels(String s) {
    char[] chars = s.toCharArray();
    int left = 0;
    int right = chars.length - 1;
    while (left < right) {
      if (isVowel(chars[left]) && isVowel(chars[right])) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
      } else if (isVowel(chars[left])) {
        right--;
      } else {
        left++;
      }
    }
    return new String(chars);
  }
}
