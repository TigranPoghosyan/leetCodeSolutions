package leetCodeSolutions.easyProblems.minimumCommonValue2540;

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int firstStart = 0;
        int secondStart = 0;

        while (firstStart < nums1.length && secondStart < nums2.length) {
            if (nums1[firstStart] == nums2[secondStart]) {
                return nums1[firstStart];
            } else if (nums1[firstStart] > nums2[secondStart]) {
                secondStart++;
            } else {
                firstStart++;
            }
        }
        return -1;
    }
}