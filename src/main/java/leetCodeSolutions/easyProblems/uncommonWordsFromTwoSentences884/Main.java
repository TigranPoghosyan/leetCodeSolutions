package leetCodeSolutions.easyProblems.uncommonWordsFromTwoSentences884;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.uncommonFromSentences("this apple is sweet", "this apple is sour");
        System.out.println(Arrays.toString(result));
    }
}
