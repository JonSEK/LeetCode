/*
You are given a string num representing a large integer.
An integer is good if it meets the following conditions:
It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:
A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.

Example 1:
Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".

Example 2:
Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.

Example 3:
Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
*/

import java.util.ArrayList;

public class Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
    }

    public static String largestGoodInteger(String num) {
        ArrayList<String> newArr = new ArrayList<>();
        for (int i = 1; i < num.length() - 1; i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i + 1)) {
                newArr.add("" + num.charAt(i) + num.charAt(i - 1) + num.charAt(i - 1));
            }
        }
        newArr.sort((s1, s2) -> Integer.parseInt(s2) - Integer.parseInt(s1));

        return newArr.isEmpty() ? "" : newArr.get(0);
    }
}
