/*
Given a string s of lower and upper case English letters.
A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:

    0 <= i <= s.length - 2
s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
Notice that an empty string is also good.

Example 1:
Input: s = "leEeetcode"
Output: "leetcode"
Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".

Example 2:
Input: s = "abBAcC"
Output: ""
Explanation: We have many possible scenarios, and all lead to the same answer. For example:
    "abBAcC" --> "aAcC" --> "cC" --> ""
    "abBAcC" --> "abBA" --> "aA" --> ""

Example 3:
Input: s = "s"
Output: "s"
*/

import java.util.ArrayDeque;
import java.util.Deque;

public class MakeTheStringGreat {
  public static String makeGood(String s) {
    Deque<Character> stack = new ArrayDeque<>();

    for (char c : s.toCharArray()) {
      if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) { // 32 is the difference between ASCII values of lowercase and uppercase letters
        stack.pop(); // Remove the previous character
      } else {
        stack.push(c); // Add the current character to stack
      }
    }

    StringBuilder sb = new StringBuilder();
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }

    return sb.reverse().toString(); // Reversing the string to maintain the original order
  }

  public static void main(String[] args) {
    String s1 = "leEeetcode";
    System.out.println(makeGood(s1));

    String s2 = "abBAcC";
    System.out.println(makeGood(s2));

    String s3 = "s";
    System.out.println(makeGood(s3));
  }
}
