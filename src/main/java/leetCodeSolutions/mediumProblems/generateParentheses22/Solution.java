package leetCodeSolutions.mediumProblems.generateParentheses22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrace(result, "", 0, 0, n);
        return result;
    }

    private void backtrace(List<String> result, String currentWord, int open, int close, int max) {
        if (currentWord.length() == max * 2) {
            result.add(currentWord);
            return;
        }
        if (open < max) {
            backtrace(result, currentWord + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrace(result, currentWord + ")", open, close + 1, max);

        }
    }

}
