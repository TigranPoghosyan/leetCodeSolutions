package leetCodeSolutions.easyProblems.uniqueNumberOfOccurrences1207;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        HashSet<Integer> uniqueVals = new HashSet(map.values());

        return map.values().size() == uniqueVals.size();
    }
}
