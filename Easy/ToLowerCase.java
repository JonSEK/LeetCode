/*
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:
Input: s = "Hello"
Output: "hello"

Example 2:
Input: s = "here"
Output: "here"

Example 3:
Input: s = "LOVELY"
Output: "lovely"
*/

public class ToLowerCase {
  public static String toLowerCase(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (c >= 'A' && c <= 'Z') {
        sb.append((char) (c + 32));
      } else {
        sb.append(c);
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String s1 = "Hello";
    System.out.println(toLowerCase(s1)); // Output: hello
  }
}
