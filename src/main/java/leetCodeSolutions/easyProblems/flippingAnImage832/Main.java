package leetCodeSolutions.easyProblems.flippingAnImage832;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = solution.flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(result));
    }
}
