/*
Given an array of points on the X-Y plane points where points[i] = [xi, yi], return the area of the largest triangle that can be formed by any three different points.
Answers within 10-5 of the actual answer will be accepted.

Example 1:
Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
Output: 2.00000
Explanation: The five points are shown in the above figure. The red triangle is the largest.

Example 2:
Input: points = [[1,0],[0,0],[0,1]]
Output: 0.50000
*/

public class LargestTriangleArea {
  public static void main(String[] args) {
    int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
    System.out.println(largestTriangleArea(points));
  }

  public static double largestTriangleArea(int[][] points) {
    double maxArea = 0;
    for (int i = 0; i < points.length; i++) {
      for (int j = i + 1; j < points.length; j++) {
        for (int k = j + 1; k < points.length; k++) {
          double area = Math.abs(0.5 * (points[i][0] * (points[j][1] - points[k][1]) + points[j][0] * (points[k][1] - points[i][1]) + points[k][0] * (points[i][1] - points[j][1])));
          maxArea = Math.max(maxArea, area);
        }
      }
    }
    return maxArea;
  }
}
