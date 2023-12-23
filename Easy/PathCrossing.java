/*
Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively. You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited. Return false otherwise.

Example 1:
Input: path = "NES"
Output: false
Explanation: Notice that the path doesn't cross any point more than once.

Example 2:
Input: path = "NESWW"
Output: true
Explanation: Notice that the path visits the origin twice.
*/

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
  public static void main(String[] args) {
    String path = "NESWW";
    System.out.println(isPathCrossing(path));
  }

  public static boolean isPathCrossing(String path) {
// Initialize a set to keep track of visited coordinates
    Set<String> visited = new HashSet<>();

    // Initialize the current coordinates
    int x = 0;
    int y = 0;

    // Add the origin to the set
    visited.add(x + "," + y);

    // Loop through the path
    for (char direction : path.toCharArray()) {
      // Update the coordinates
      if (direction == 'N') {
        y++;
      } else if (direction == 'S') {
        y--;
      } else if (direction == 'E') {
        x++;
      } else if (direction == 'W') {
        x--;
      }

      // Check if the coordinates have been visited
      if (visited.contains(x + "," + y)) {
        return true;
      } else {
        visited.add(x + "," + y);
      }
    }

    // Return false if the path never crosses itself
    return false;
  }
}
