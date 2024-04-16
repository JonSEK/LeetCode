/*
Given a string licensePlate and an array of strings words, find the shortest completing word in words.
A completing word is a word that contains all the letters in licensePlate.
Ignore numbers and spaces in licensePlate, and treat letters as case insensitive.
If a letter appears more than once in licensePlate, then it must appear in the word the same number of times or more.
For example, if licensePlate = "aBc 12c", then it contains letters 'a', 'b' (ignoring case), and 'c' twice.
Possible completing words are "abccdef", "caaacab", and "cbca".
Return the shortest completing word in words. It is guaranteed an answer exists.
If there are multiple shortest completing words, return the first one that occurs in words.

Example 1:
Input: licensePlate = "1s3 PSt", words = ["step","steps","stripe","stepple"]
Output: "steps"
Explanation: licensePlate contains letters 's', 'p', 's' (ignoring case), and 't'.
    "step" contains 't' and 'p', but only contains 1 's'.
    "steps" contains 't', 'p', and both 's' characters.
"stripe" is missing an 's'.
    "stepple" is missing an 's'.
Since "steps" is the only word containing all the letters, that is the answer.

Example 2:
Input: licensePlate = "1s3 456", words = ["looks","pest","stew","show"]
Output: "pest"
Explanation: licensePlate only contains the letter 's'. All the words contain 's', but among these "pest", "stew", and "show" are shortest. The answer is "pest" because it is the word that appears earliest of the 3.
*/

public class ShortestCompletingWord {
  public static void main(String[] args) {
    String licensePlate = "1s3 PSt";
    String[] words = {"step", "steps", "stripe", "stepple"};
    System.out.println(shortestCompletingWord(licensePlate, words));
  }

  public static boolean isCompletingWord(int[] licensePlateArr, String word) {
    int[] wordArr = new int[26];
    for (char c : word.toCharArray()) {
      wordArr[Character.toLowerCase(c) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (licensePlateArr[i] > wordArr[i]) {
        return false;
      }
    }
    return true;
  }

  public static String shortestCompletingWord(String licensePlate, String[] words) {
    int[] licensePlateArr = new int[26];
    for (char c : licensePlate.toCharArray()) {
      if (Character.isLetter(c)) {
        licensePlateArr[Character.toLowerCase(c) - 'a']++;
      }
    }
    String result = "";
    for (String word : words) {
      if (isCompletingWord(licensePlateArr, word) && (result.isEmpty() || word.length() < result.length())) {
        result = word;
      }
    }
    return result;
  }
}