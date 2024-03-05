package leetCodeSolutions.mediumProblems.groupAnagrams49;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(words);
        System.out.println(result);
    }
}
