package leetCodeSolutions.easyProblems.floodFill733;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int[][] result = solution.floodFill(image,1,1,2);
        System.out.println(Arrays.deepToString(result));
    }
}
