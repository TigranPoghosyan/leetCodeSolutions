package leetCodeSolutions.mediumProblems.wordSubset916;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();

        int[] maxCharFreq2 = new int[26];

        for (String currentWord : words2) {
            int[] charFreq = getCharFreq(currentWord);

            for (int j = 0; j < 26; j++) {
                maxCharFreq2[j] = Math.max(maxCharFreq2[j], charFreq[j]);
            }
        }
        for (String currentWord : words1) {
            int[] charFreq1 = getCharFreq(currentWord);

            boolean isValid = true;
            for (int j = 0; j < 26; j++) {
                if (maxCharFreq2[j] > charFreq1[j]) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                result.add(currentWord);
            }
        }
        return result;
    }

    private int[] getCharFreq(String currentWord) {
        int[] result = new int[26];
        for (char c : currentWord.toCharArray()) {
            result[c - 'a']++;
        }
        return result;
    }
}
