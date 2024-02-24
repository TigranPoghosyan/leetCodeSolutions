package leetCodeSolutions.mediumProblems.maxIncreaseToKeepCitySkyline807;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
       int result = 0;
       int n = grid.length;
       int[] maxRows = new int[n];
       int[] maxColumns = new int[n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maxRows[i] = Math.max(maxRows[i],grid[i][j]);
                maxColumns[j] = Math.max(maxColumns[j],grid[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.min(maxRows[i],maxColumns[j] - grid[i][j]);
            }
        }
        return result;
    }
}
