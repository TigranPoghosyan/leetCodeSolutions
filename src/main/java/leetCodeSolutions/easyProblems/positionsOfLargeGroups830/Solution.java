package leetCodeSolutions.easyProblems.positionsOfLargeGroups830;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int len = s.length();

        while (start < len) {
            char ch = s.charAt(start);

            int end = start;
            while (end < len && ch == s.charAt(end)) {
                end++;
            }
            if (end - start >= 3) {
                List<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end - 1);
                result.add(list);
            }
            start = end;
        }
        return result;
    }
}
