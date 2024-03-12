package leetCodeSolutions.easyProblems.largestSubstringBetweenTwoEqualCharacters1624;

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLength = -1;
        int[] mapCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';

            if (mapCount[index] == 0) {
                mapCount[index] = i + 1;
            } else {
                maxLength = Math.max(maxLength, i - mapCount[index]);
            }
        }
        return maxLength;
    }
}
