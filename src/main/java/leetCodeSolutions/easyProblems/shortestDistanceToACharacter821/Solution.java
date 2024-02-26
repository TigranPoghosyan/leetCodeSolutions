package leetCodeSolutions.easyProblems.shortestDistanceToACharacter821;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] result = new int[n];

        int cPos = -n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c){
                cPos = i;
            }
            result[i] = i - cPos;
        }

        for (int i = n-1; i >= 0; i--) {
            if (s.charAt(i) == c){
                cPos = i;
            }
            result[i] = Math.min(result[i],Math.abs(i-cPos));
        }
        return result;
    }
}
