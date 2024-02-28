package leetCodeSolutions.easyProblems.numberOfLinesToWriteString806;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] result = solution.numberOfLines(widths, "abcdefghijklmnopqrstuvwxyz");
        System.out.println(Arrays.toString(result));
    }
}
