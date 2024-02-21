package leetCodeSolutions.mediumProblems.peakIndexInAMountainArray852;

public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] < arr[middle + 1]) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }
        return start;
    }
}
