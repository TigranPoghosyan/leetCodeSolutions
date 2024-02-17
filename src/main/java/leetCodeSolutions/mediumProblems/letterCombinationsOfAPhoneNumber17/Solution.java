package leetCodeSolutions.mediumProblems.letterCombinationsOfAPhoneNumber17;

import java.util.ArrayList;
import java.util.List;

class Solution {
    final char[][] LETTERS = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
            {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

    public List<String> letterCombinations(String digits) {
        int length = digits.length();
        List<String> result = new ArrayList<>();
        if (length == 0) return result;
        dfs(0, length, new StringBuilder(), result, digits);
        return result;
    }

    public void dfs(int pos, int length, StringBuilder sb, List<String> answer, String digits) {
        if (pos == length) answer.add(sb.toString());
        else {
            char[] letters = LETTERS[Character.getNumericValue(digits.charAt(pos))];
            for (int i = 0; i < letters.length; i++)
                dfs(pos+1, length, new StringBuilder(sb).append(letters[i]), answer, digits);
        }
    }
}
