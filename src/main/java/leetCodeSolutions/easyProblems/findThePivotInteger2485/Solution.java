package leetCodeSolutions.easyProblems.findThePivotInteger2485;

public class Solution {
    public int pivotInteger(int n) {
        int answer = (n * n + n) / 2;
        int square = (int) Math.sqrt(answer);
        if (square * square == answer) {
            return square;
        } else {
            return -1;
        }
    }
}
