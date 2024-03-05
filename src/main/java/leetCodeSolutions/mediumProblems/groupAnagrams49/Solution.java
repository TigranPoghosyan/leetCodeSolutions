package leetCodeSolutions.mediumProblems.groupAnagrams49;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return Collections.emptyList();
        }
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] charCount = new char[26];
            for (char c : word.toCharArray()) {
                charCount[c - 'a']++;
            }

            String key = new String(charCount);
            List<String> wordList = map.getOrDefault(key, new ArrayList<>());
            wordList.add(word);
            map.put(key, wordList);
        }
        return new ArrayList<>(map.values());
    }
}
