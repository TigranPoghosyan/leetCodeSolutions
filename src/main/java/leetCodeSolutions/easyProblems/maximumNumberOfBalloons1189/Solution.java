package leetCodeSolutions.easyProblems.maximumNumberOfBalloons1189;

public class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] charCount = new int[26];
        for (char c : text.toCharArray()) {
            charCount[c - 'a']++;
        }
        int min = charCount[1];
        min = Math.min(min, charCount[0]);
        min = Math.min(min, charCount[11] / 2);
        min = Math.min(min, charCount[14] / 2);
        min = Math.min(min, charCount[13]);

        return min;
    }
}
