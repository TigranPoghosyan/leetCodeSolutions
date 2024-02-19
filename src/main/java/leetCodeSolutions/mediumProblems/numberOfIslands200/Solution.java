package leetCodeSolutions.mediumProblems.numberOfIslands200;

public class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    count+=1;
                    callDfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private void callDfs(char[][] grid, int i, int j) {
        if(i < 0 || i>= grid.length || j < 0 || j>= grid[i].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        callDfs(grid,i-1,j);
        callDfs(grid,i+1,j);
        callDfs(grid,i,j-1);
        callDfs(grid,i,j+1);
    }

}
