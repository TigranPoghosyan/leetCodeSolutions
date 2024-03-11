package leetCodeSolutions.mediumProblems.customSortString791;

import java.util.HashMap;

public class Solution {
    public String customSortString(String order, String s) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : order.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) > 1) {
                    map.put(c, map.getOrDefault(c, 0) - 1);
                    result.append(c);
                } else {
                    result.append(c);
                    map.remove(c);
                }
            }
        }

        for (char c : map.keySet()) {
            result.append(String.valueOf(c));
            map.remove(c);
        }

        return result.toString();
    }
}
