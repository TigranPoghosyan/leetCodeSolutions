package leetCodeSolutions.mediumProblems.wordSubset916;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};
        List<String> result = solution.wordSubsets(words1, words2);
        System.out.println(result);
    }
}
