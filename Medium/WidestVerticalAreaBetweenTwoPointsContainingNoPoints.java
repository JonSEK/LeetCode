/*
Given n points on a 2D plane where points[i] = [xi, yi],
Return the widest vertical area between two points such that no points are inside the area.
A vertical area is an area of fixed-width extending infinitely along the y-axis
(i.e., infinite height). The widest vertical area is the one with the maximum width.
Note that points on the edge of a vertical area are not considered included in the area.
Example 1:
Input: points = [[8,7],[9,9],[7,4],[9,7]]
Output: 1
Explanation: Both the red and the blue area are optimal.
Example 2:
Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
Output: 3
*/

import java.util.Arrays;
import java.util.Comparator;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
  public static void main(String[] args) {
    int[][] arr = {{3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}};
    System.out.println(maxWidthOfVerticalArea(arr));
  }

  public static int maxWidthOfVerticalArea(int[][] points) {
    Arrays.sort(points, Comparator.comparingInt(arr -> arr[0]));
    int widest = 0;
    for (int i = 0; i < points.length - 1; i++) {
      widest = Math.max(widest, points[i + 1][0] - points[i][0]);
    }
    return widest;
  }
}
