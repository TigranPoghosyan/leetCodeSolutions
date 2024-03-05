package leetCodeSolutions.easyProblems.intersectionOfTwoNonSortedArraysWithDuplicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> firstArrayMap = new HashMap<>();

        for(int elem:arr1){
            firstArrayMap.put(elem,firstArrayMap.getOrDefault(elem,0)+1);
        }

        for(int elem:arr2){
            if (firstArrayMap.containsKey(elem)){
                result.add(elem);

                int count = firstArrayMap.get(elem) - 1;

                if(count == 0){
                    firstArrayMap.remove(elem);
                }else {
                    firstArrayMap.put(elem,count);
                }
            }
        }
        return result;
    }
}
