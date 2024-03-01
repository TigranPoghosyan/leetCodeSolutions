package leetCodeSolutions.easyProblems.distributerCandiesToPeople1103;

public class Solution {
    public int[] distributeCandies(int candies, int numPeople) {
        int[] result = new int[numPeople];
        for (int i = 0; candies > 0; i++) {
            result[i % numPeople] += Math.min(candies, i + 1);
            candies -= i + 1;
        }
        return result;
    }
}
