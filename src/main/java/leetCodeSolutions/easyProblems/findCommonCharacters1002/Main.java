package leetCodeSolutions.easyProblems.findCommonCharacters1002;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"bella","label","roller"};
        List<String> result = solution.commonCharacters(words);
        System.out.println(result);
    }
}
