package leetCodeSolutions.easyProblems.findChampioneOne2923;

public class Solution {
    public int findChampion(int[][] grid) {
        int gridLength = grid.length;
        for (int i = 0; i < gridLength; i++) {
            int champion = 0;
            for (int j = 0; j < gridLength; j++) {
                if (i != j && grid[i][j] == 1) {
                    champion++;
                }
            }

            if (champion == gridLength - 1) {
                return i;
            }
        }
        return -1;
    }
}
