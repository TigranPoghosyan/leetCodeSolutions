package leetCodeSolutions.easyProblems.relativeRanks506;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int max = maximum(score);
        String[] ans = new String[score.length];
        int[] rank = new int[max + 1];
        for (int i = 0; i < score.length; i++) {
            rank[score[i]] = i + 1;
        }
        int count = 1;
        for (int i = max; i >= 0; i--) {
            if (rank[i] != 0) {
                if (count == 1) {
                    ans[rank[i] - 1] = "Gold Medal";
                } else if (count == 2) {
                    ans[rank[i] - 1] = "Silver Medal";
                } else if (count == 3) {
                    ans[rank[i] - 1] = "Bronze Medal";
                } else {
                    ans[rank[i] - 1] = String.valueOf(count);
                }
                count++;
            }
        }
        return ans;
    }

    public int maximum(int[] score) {
        int max = Integer.MIN_VALUE;
        for (int i : score) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
