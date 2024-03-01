package leetCodeSolutions.mediumProblems.longestWordInDictionary720;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"w", "wo", "wor", "worl", "world"};
        String result = solution.longestWord(words);
        System.out.println(result);
    }
}
