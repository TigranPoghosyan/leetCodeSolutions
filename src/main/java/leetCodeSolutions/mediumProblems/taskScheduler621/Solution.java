package leetCodeSolutions.mediumProblems.taskScheduler621;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        char[] charMap = new char[26];
        int max = 0;
        int charCount = 0;
        for (char c : tasks) {
            charMap[c - 'A']++;
            max = Math.max(max, charMap[c - 'A']);
        }

        for (char c : charMap) {
            if (c == max) {
                charCount++;
            }
        }
        return Math.max(tasks.length, (max - 1) * (n + 1) + charCount);
    }
}
