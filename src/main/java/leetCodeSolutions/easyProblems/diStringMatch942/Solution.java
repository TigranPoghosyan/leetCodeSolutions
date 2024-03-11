package leetCodeSolutions.easyProblems.diStringMatch942;

class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] arr = new int[n + 1];
        char[] c = s.toCharArray();
        int minNum = 0;
        int greatNum = n;
        for(int i = 0;i < n; i++){
            if(c[i] == 'D'){
                arr[i] = greatNum;
                greatNum--;
            } else {
                arr[i] = minNum;
                minNum++;
            }
        }
        arr[n] = greatNum;
        return arr;
    }
}
