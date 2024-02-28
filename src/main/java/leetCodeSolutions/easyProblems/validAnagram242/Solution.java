package leetCodeSolutions.easyProblems.validAnagram242;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return Arrays.equals(frequent(s), frequent(t));
    }

    public int[] frequent(String word) {
        int[] result = new int[26];
        for (char c : word.toCharArray()) {
            result[c - 'a']++;
        }
        return result;
    }
}
