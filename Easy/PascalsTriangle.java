/*
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]
*/

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> total = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // Every row starts with 1
            row.add(1);

            // Calculate the rest of the row based on the previous row
            for (int j = 1; j < i; j++) {
                int num = total.get(i - 1).get(j - 1) + total.get(i - 1).get(j);
                row.add(num);
            }

            // Every row ends with 1
            if (i > 0) {
                row.add(1);
            }

            total.add(row);
        }
        return total;
    }
}
