package leetCodeSolutions.easyProblems.buddyStrings859;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public boolean buddyStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        if (a.equals(b)) {
            Set<Character> unique = new HashSet<>();
            for (char c : a.toCharArray()) {
                unique.add(c);
            }
            return unique.size() < a.length();
        }
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diff.add(i);
            }
        }
        return diff.size() == 2 && a.charAt(diff.get(0)) == b.charAt(diff.get(1)) && a.charAt(diff.get(1)) == b.charAt(diff.get(0));
    }
}
