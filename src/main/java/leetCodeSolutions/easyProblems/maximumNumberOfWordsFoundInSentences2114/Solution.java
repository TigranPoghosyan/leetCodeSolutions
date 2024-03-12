package leetCodeSolutions.easyProblems.maximumNumberOfWordsFoundInSentences2114;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            // max = Math.max(max,sentence.split(" ").length);
            max = Math.max(max, countWord(sentence));
        }
        return max;
    }
    public int countWord(String s) {
        int start = 0;
        int end = s.length();
        int count = 0;
        char[] c = s.toCharArray();
        while (start < end) {
            if (c[start] == ' ') {
                count++;
            }
            start++;
        }
        count++;
        return count;
    }
}