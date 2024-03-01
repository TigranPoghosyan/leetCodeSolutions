package leetCodeSolutions.mediumProblems.longestWordInDictionary720;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"w", "wo", "wor", "worl", "world"};
        String[] words2 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
//        String result = solution.longestWord(words);
        String result2 = solution.longestWord(words2);
//        System.out.println(result);
        System.out.println(result2);
    }
}
