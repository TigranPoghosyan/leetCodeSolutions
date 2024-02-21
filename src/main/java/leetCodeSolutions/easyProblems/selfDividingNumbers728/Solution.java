package leetCodeSolutions.easyProblems.selfDividingNumbers728;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public boolean isSelfDividing(int num) {
        for (char c : String.valueOf(num).toCharArray()) {
            if (c == '0' || num % (c - '0') > 0) {
                return false;
            }
        }
        return true;
    }
}
