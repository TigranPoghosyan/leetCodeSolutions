package leetCodeSolutions.easyProblems.countOfCharacters;

public class Solution {
    public String countOfCharacters(String word) {

        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Входная строка пуста или равна null");
        }

        StringBuilder result = new StringBuilder();
        char prevChar = word.charAt(0);
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (currentChar == prevChar) {
                count++;
            } else {
                if (count > 1) {
                    result.append(prevChar).append(count);
                } else {
                    result.append(prevChar);
                }
                count = 1;
                prevChar = currentChar;
            }
        }
        if (count > 1) {
            result.append(prevChar).append(count);
        } else {
            result.append(prevChar);
        }

        return result.toString();
    }
}
