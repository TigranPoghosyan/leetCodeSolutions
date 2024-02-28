package leetCodeSolutions.easyProblems.longestPalindrome409;

class Solution {
    public int longestPalindrome(String s) {
        int max = 0;
        int oneMore = 0;
        if (s.length() == 1) {
            return 1;
        }
        int[] result = new int[128];
        for (char c : s.toCharArray()) {
            result[c]++;
        }
        for (Integer charCount : result) {
            if (charCount % 2 == 0) {
                max += charCount;
            } else if (charCount > 1) {
                charCount = charCount - 1;
                max += charCount;
                oneMore++;
            } else if (charCount == 1) {
                oneMore++;
            }
        }
        return oneMore > 0 ? max + 1 : max;
    }
}

// Second solution
//class Solution {
//    public int longestPalindrome(String s) {
//        int max = 0;
//        int oneMore = 0;
//        if(s.length() == 1){
//            return 1;
//        }
//        int[] result = new int[128];
//        for(char c:s.toCharArray()){
//            result[c]++;
//        }
//
//        for(Integer charCount: result){
//            max += charCount / 2 * 2;
//            if(max % 2 == 0 && charCount % 2 == 1){
//                max += 1;
//            }
//        }
//        return max;
//    }
//}
