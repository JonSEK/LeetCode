/*
There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive).
The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi.
Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.
You want to determine if there is a valid path that exists from vertex source to vertex destination.
Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.

Example 1:
Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
Output: true
Explanation: There are two paths from vertex 0 to vertex 2:
    - 0 → 1 → 2
    - 0 → 2

Example 2:
Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
Output: false
Explanation: There is no path from vertex 0 to vertex 5.
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindIfPathExistsInGraph {
  public static void main(String[] args) {
    int n = 3;
    int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
    int source = 0;
    int destination = 2;
    System.out.println(validPath(n, edges, source, destination));
  }

  public static boolean validPath(int n, int[][] edges, int source, int destination) {
    List<List<Integer>> graph = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] edge : edges) {
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[n];
    queue.add(source);
    visited[source] = true;
    while (!queue.isEmpty()) {
      int current = queue.poll();
      if (current == destination) {
        return true;
      }
      for (int neighbor : graph.get(current)) {
        if (!visited[neighbor]) {
          queue.add(neighbor);
          visited[neighbor] = true;
        }
      }
    }
    return false;
  }

}
