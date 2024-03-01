package leetCodeSolutions.mediumProblems.longestWordInDictionary720;

import java.util.*;

public class Solution {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        Collections.addAll(set, words);

        Queue<String> queue = new LinkedList<>();
        queue.add("");
        String word = "";

        while (!queue.isEmpty()) {
            word = queue.poll();
            for (int i = 25; i >= 0; i--) {
                String key = word + (char) ('a' + i);
                if (set.contains(key)) {
                    queue.add(key);
                }
            }
        }
        return word;
    }
}

//public String longestWord(String[] words) {
//    Set<String> set = new HashSet<>();
//    Collections.addAll(set, words);
//
//    Queue<String> queue = new LinkedList<>();
//    queue.add("");
//    String word = "";
//
//    while (!queue.isEmpty()) {
//        word = queue.poll();
//        for (int i = 25; i >= 0; i--) {
//            String key = word + (char) ('a' + i);
//            if (set.contains(key)) {
//                queue.add(key);
//            }
//        }
//    }
//    return word;
//}
