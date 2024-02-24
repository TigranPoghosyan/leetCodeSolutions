package leetCodeSolutions.mediumProblems.twoSumTwoInputArrayIsSorted167;

public class Solution {
    //First solution
    //Two Pointer Solution
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                return new int[]{start + 1, end + 1};
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            }
        }
        return new int[]{start + 1, end + 1};
    }
}


//Second Solution
//public int[] twoSum(int[] numbers, int target) {
//    Map<Integer,Integer> map = new HashMap<>();
//    for(int i = 0;i<numbers.length-1;i++){
//        if(map.containsKey(target - numbers[i])){
//            return new int[]{map.get(target - numbers[i]) + 1,i + 1};
//        }
//        map.put(numbers[i],i);
//    }
//    return new int[]{};
//}
