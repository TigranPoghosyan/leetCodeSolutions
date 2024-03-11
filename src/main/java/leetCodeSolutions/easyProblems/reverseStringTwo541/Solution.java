package leetCodeSolutions.easyProblems.reverseStringTwo541;

public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int j = Math.min(start + k - 1, end - 1);
            reverse(arr, start, j);
            start = start + 2 * k;
        }
        return new String(arr);
    }

    public void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
