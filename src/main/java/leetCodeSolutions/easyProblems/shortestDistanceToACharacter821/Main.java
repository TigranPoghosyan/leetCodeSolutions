package leetCodeSolutions.easyProblems.shortestDistanceToACharacter821;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "loveleetcode";
        int[] result = solution.shortestToChar(s,'e');
        System.out.println(Arrays.toString(result));
    }
}
