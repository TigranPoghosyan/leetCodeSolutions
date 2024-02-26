package leetCodeSolutions.easyProblems.mostCommonWord819;

import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>();
        Map<String, Integer> validWordCount = new HashMap<>();

        Collections.addAll(bannedWords, banned);
        String[] words = paragraph.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!bannedWords.contains(word)) {
                validWordCount.put(word, validWordCount.getOrDefault(word, 0) + 1);
            }
        }

        int max = 0;
        String result = "";

        for (String word : validWordCount.keySet()) {
            if (validWordCount.get(word) > max) {
                max = validWordCount.get(word);
                result = word;
            }
        }
        return result;
    }
}
