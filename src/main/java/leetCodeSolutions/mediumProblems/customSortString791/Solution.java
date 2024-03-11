package leetCodeSolutions.mediumProblems.customSortString791;

public class Solution {
    public String customSortString(String order, String s) {
        StringBuilder builder = new StringBuilder();
        int[] freq = new int[32];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < order.length(); i++) {
            while (freq[order.charAt(i) - 'a'] > 0) {
                builder.append(order.charAt(i));
                freq[order.charAt(i) - 'a']--;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                builder.append((char) (i + 'a'));
                freq[i]--;
            }
        }
        return String.valueOf(builder);
    }
}

// First Solution
//public String customSortString(String order, String s) {
//    StringBuilder result = new StringBuilder();
//    HashMap<Character, Integer> mp = new HashMap<>();
//    for (char c : s.toCharArray()) {
//        mp.put(c, mp.getOrDefault(c, 0) + 1);
//    }
//    for (char c : order.toCharArray()) {
//        if (mp.containsKey(c)) {
//            result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
//            mp.remove(c);
//        }
//    }
//    for (char c : mp.keySet()) {
//        result.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
//    }
//    return result.toString();
//}
