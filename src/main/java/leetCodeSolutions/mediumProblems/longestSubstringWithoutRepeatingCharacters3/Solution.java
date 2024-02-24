package leetCodeSolutions.mediumProblems.longestSubstringWithoutRepeatingCharacters3;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s){
        int first = 0;
        int second = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();

        while (second <= s.length() - 1){

            if (!set.contains(s.charAt(second))){
                set.add(s.charAt(second));
                max = Math.max(max,set.size());
                second++;
            }else {
                set.remove(s.charAt(first));
                first++;
            }
        }
        return max;
    }
}
