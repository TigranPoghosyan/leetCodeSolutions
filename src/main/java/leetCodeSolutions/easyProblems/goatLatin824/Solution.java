package leetCodeSolutions.easyProblems.goatLatin824;

import java.util.HashSet;

class Solution {
    public String toGoatLatin(String sentence) {
        HashSet<Character> vowels = new HashSet<>();
        String aeiouAEIOU = "aeiouAEIOU";
        for (char c : aeiouAEIOU.toCharArray()) {
            vowels.add(c);
        }
        StringBuilder result = new StringBuilder();
        int index = 1;

        for (String word : sentence.split("\\s")) {
            char firstLetter = word.charAt(0);
            if (index > 1) {
                result.append(" ");
            }
            if (vowels.contains(firstLetter)) {
                result.append(word).append("ma");
            } else {
                result.append(word.substring(1)).append(firstLetter).append("ma");
            }

            for (int j = 0; j < index; j++) {
                result.append("a");
            }

            index += 1;
        }

        return result.toString();
    }
}
