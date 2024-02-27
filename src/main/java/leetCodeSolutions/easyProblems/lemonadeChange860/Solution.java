package leetCodeSolutions.easyProblems.lemonadeChange860;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;

        for (Integer num : bills) {
            if (num == 5) {
                fives++;
            } else if (num == 10) {
                tens++;
                fives--;
            } else if (tens > 0) {
                tens--;
                fives--;
            } else {
                fives -= 3;
            }
            if (fives < 0) {
                return false;
            }
        }
        return true;
    }
}
