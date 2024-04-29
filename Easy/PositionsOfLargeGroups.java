/*
In a string s of lowercase letters, these letters form consecutive groups of the same character.
For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group.
In the above example, "xxxx" has the interval [3,6].
A group is considered large if it has 3 or more characters.
Return the intervals of every large group sorted in increasing order by start index.

Example 1:
Input: s = "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the only large group with start index 3 and end index 6.

Example 2:
Input: s = "abc"
Output: []
Explanation: We have groups "a", "b", and "c", none of which are large groups.

Example 3:
Input: s = "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]
Explanation: The large groups are "ddd", "eeee", and "bbb".
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsOfLargeGroups {
  public static void main(String[] args) {
    System.out.println(largeGroupPositions("abbxxxxzzy"));
  }

  public static List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>> result = new ArrayList<>();
    int start = 0;
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(i - 1)) {
        if (i - start >= 3) {
          result.add(Arrays.asList(start, i - 1));
        }
        start = i;
      }
    }
    if (s.length() - start >= 3) {
      result.add(Arrays.asList(start, s.length() - 1));
    }
    return result;
  }
}
