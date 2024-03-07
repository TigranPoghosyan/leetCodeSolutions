package leetCodeSolutions.easyProblems.shortestCompletingWord748;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] charCount = new int[26];
        List<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        String resultWord = "";

        for (char c : licensePlate.toCharArray()) {
            if (isChar(c)) {
                char lowerCase = Character.toLowerCase(c);
                charCount[lowerCase - 'a']++;
            }
        }

        for (String word : words) {
            int[] wordCharCount = new int[26];
            boolean flag = true;
            for (char c : word.toCharArray()) {
                wordCharCount[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if (charCount[i] > wordCharCount[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                result.add(word);
                if (word.length() < min) {
                    min = word.length();
                }
            }

            for (String s : result) {
                if (s.length() == min) {
                    return s;
                }
            }
        }
        return "-1";
    }


}
