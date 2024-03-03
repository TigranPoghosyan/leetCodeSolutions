package leetCodeSolutions.mediumProblems.findAllAnagramsInAString438;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> anagrams = solution.findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams);
    }
}
