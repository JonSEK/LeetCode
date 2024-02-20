/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
In the American keyboard:
the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]

Example 2:
Input: words = ["omk"]
Output: []

Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
*/

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
  public static void main(String[] args) {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    String[] result = findWords(words);
    for (String word : result) {
      System.out.println(word);
    }
  }

  public static String[] findWords(String[] words) {
    String[] keyboard = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    List<String> result = new ArrayList<>();
    for (String word : words) {
      int row = -1;
      for (int i = 0; i < 3; i++) {
        if (keyboard[i].indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
          row = i;
          break;
        }
      }
      boolean isSameRow = true;
      for (int i = 1; i < word.length(); i++) {
        if (keyboard[row].indexOf(Character.toLowerCase(word.charAt(i))) == -1) {
          isSameRow = false;
          break;
        }
      }
      if (isSameRow) {
        result.add(word);
      }
    }
    return result.toArray(new String[0]);
  }
}
