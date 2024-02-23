package leetCodeSolutions.easyProblems.findWordsThatCanBeFormedByCharacters1160;

import java.util.Arrays;

public class Solution {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        int[] charCounts = new int[26];

        for (char c : chars.toCharArray()) {
            charCounts[c - 'a']++;
        }
        for (String word : words) {
            int[] tempCharCount = Arrays.copyOf(charCounts, charCounts.length);
            int valid = 0;
            for (char c : word.toCharArray()) {
                if (tempCharCount[c - 'a'] > 0) {
                    valid++;
                    tempCharCount[c - 'a']--;
                }
            }
            if (valid == word.length()) {
                result += word.length();
            }
        }
        return result;
    }
}
