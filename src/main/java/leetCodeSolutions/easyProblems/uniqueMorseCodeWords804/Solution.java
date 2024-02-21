package leetCodeSolutions.easyProblems.uniqueMorseCodeWords804;

import java.util.HashSet;

public class Solution {
    public int uniqueMorseRepresentation(String[] words){
        HashSet<String> unique = new HashSet();

        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        for(String word:words){
            StringBuilder transformation = new StringBuilder();

            for(char c:word.toCharArray()){
                transformation.append(MORSE[c-'a']);
            }
            unique.add(transformation.toString());
        }

        return unique.size();
    }
}
