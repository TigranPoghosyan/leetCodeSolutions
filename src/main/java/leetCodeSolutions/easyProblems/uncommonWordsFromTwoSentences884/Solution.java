package leetCodeSolutions.easyProblems.uncommonWordsFromTwoSentences884;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : s1.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : s2.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<String> answer = new ArrayList<>();
        for (String word : map.keySet()) {
            if (map.get(word) == 1) {
                answer.add(word);
            }
        }
        return answer.toArray(new String[0]);
    }
}
