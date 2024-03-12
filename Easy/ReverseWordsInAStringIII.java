/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"
*/

public class ReverseWordsInAStringIII {
  public static void main(String[] args) {
    System.out.println(reverseWords("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetnoc
    System.out.println(reverseWords("Mr Ding")); // rM gniD
  }

  public static String reverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (String word : words) {
      sb.append(new StringBuilder(word).reverse()).append(" ");
    }
    return sb.toString().trim();
  }
}
