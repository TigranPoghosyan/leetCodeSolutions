package leetCodeSolutions.easyProblems.studentAttendanceRecordFirst551;

class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;

        for (char c : s.toCharArray()) {
            if (c == 'P' || c == 'A') {
                late = 0;
            }
            if (c == 'L') {
                late++;
            }
            if (late == 3) {
                return false;
            }
            if (c == 'A') {
                absent++;
            }
            if (absent >= 2) {
                return false;
            }
        }
        return true;
    }
}
