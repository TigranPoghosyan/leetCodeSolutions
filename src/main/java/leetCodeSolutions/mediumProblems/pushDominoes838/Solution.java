package leetCodeSolutions.mediumProblems.pushDominoes838;

public class Solution {
    public String pushDominoes(String word) {
        int n = word.length();
        int[] forces = new int[n];

        int force = 0;

        for (int i = 0; i < n; i++) {
            if(word.charAt(i) == 'R'){
                force = n;
            }else if(word.charAt(i) == 'L'){
                force = 0;
            }else {
                force = Math.max(force-1,0);
            }
            forces[i] += force;
        }
        for (int i = n-1; i>=0; i--) {
            if(word.charAt(i) == 'L'){
                force = n;
            }else if(word.charAt(i) == 'R'){
                force = 0;
            }else {
                force = Math.max(force-1,0);
            }
            forces[i] -= force;
        }

        StringBuilder result = new StringBuilder();

        for (Integer j : forces) {
            if (j > 0) {
                result.append("R");
            } else if (j < 0) {
                result.append("L");
            } else {
                result.append(".");
            }
        }
        return result.toString();
    }
}
