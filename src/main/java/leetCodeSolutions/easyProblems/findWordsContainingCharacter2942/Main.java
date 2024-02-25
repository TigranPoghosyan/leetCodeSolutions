package leetCodeSolutions.easyProblems.findWordsContainingCharacter2942;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"leet","code"};
        List<Integer> result = solution.findWordsContaining(words, 'e');
        System.out.println(result);
    }
}
