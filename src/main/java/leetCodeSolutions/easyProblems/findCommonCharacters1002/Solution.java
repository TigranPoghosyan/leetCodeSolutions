package leetCodeSolutions.easyProblems.findCommonCharacters1002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> commonCharacters(String[] words){
        List<String> result = new ArrayList<>();

        int[] minFreq = new int[26];
        Arrays.fill(minFreq,Integer.MAX_VALUE);

        for(String word:words){
            int[] charFreq = new int[26];

            for(char c:word.toCharArray()){
                charFreq[c-'a']++;
            }

            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i],charFreq[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0){
                result.add(""+(char)(i+'a'));
                minFreq[i]--;
            }
        }
        return result;
    }
}
