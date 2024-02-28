package leetCodeSolutions.easyProblems.assignCookies455;

import java.util.Arrays;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int aPointer = 0;
        int bPointer = 0;

        while (aPointer < g.length && bPointer < s.length) {
            if (g[aPointer] <= s[bPointer]) {
                aPointer++;
                bPointer++;
            } else {
                bPointer++;
            }
        }
        return aPointer;
    }
}
