/*
Given a string s, sort it in decreasing order based on the frequency of the characters.
The frequency of a character is the number of times it appears in the string.
Return the sorted string. If there are multiple answers, return any of them.

Example 1:
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

Example 3:
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
  public static void main(String[] args) {
    SortCharactersByFrequency obj = new SortCharactersByFrequency();
    System.out.println(obj.frequencySort("tree"));
    System.out.println(obj.frequencySort("cccaaa"));
    System.out.println(obj.frequencySort("Aabb"));
  }

  public String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
    maxHeap.addAll(map.keySet());
    StringBuilder sb = new StringBuilder();
    while (!maxHeap.isEmpty()) {
      char c = maxHeap.poll();
      sb.append(String.valueOf(c).repeat(Math.max(0, map.get(c))));
    }
    return sb.toString();
  }
}
