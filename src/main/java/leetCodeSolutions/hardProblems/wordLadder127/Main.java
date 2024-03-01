package leetCodeSolutions.hardProblems.wordLadder127;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        int result = solution.ladderLength("hit", "cog", wordList);
        System.out.println(result);
    }
}
