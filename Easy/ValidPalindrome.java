/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward.
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
*/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder();
        String alphanumericString = s.replaceAll("[^a-zA-Z0-9]", "");
        String lowerCase = alphanumericString.toLowerCase();
        for (int i = lowerCase.length() - 1; i >= 0; i--) {
            reversed.append(lowerCase.charAt(i));
        }
        return lowerCase.contentEquals(reversed);
    }
}