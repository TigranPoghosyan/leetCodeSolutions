package leetCodeSolutions.easyProblems.maximumNumberOfWordsFoundInSentences2114;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int result = solution.mostWordsFound(sentences);
        System.out.println(result);
    }
}
