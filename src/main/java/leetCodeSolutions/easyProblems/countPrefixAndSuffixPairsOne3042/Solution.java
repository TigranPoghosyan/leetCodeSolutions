package leetCodeSolutions.easyProblems.countPrefixAndSuffixPairsOne3042;

public class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].indexOf(words[i]) == 0 && words[j].lastIndexOf(words[i]) == words[j].length() - words[i].length()) {
                    result++;
                }
            }
        }
        return result;
    }
}
