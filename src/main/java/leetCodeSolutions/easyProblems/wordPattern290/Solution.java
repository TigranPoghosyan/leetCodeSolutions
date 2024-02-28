package leetCodeSolutions.easyProblems.wordPattern290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containsKey = map.containsKey(ch);

            if (map.containsValue(arr[i]) && !containsKey) {
                return false;
            }
            if (containsKey && !map.get(ch).equals(arr[i])) {
                return false;
            } else {
                map.put(ch, arr[i]);
            }
        }
        return true;
    }
}
