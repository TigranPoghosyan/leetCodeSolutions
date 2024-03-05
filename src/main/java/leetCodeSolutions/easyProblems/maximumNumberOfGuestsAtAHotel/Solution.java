package leetCodeSolutions.easyProblems.maximumNumberOfGuestsAtAHotel;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxGuests(int[][] intervals) {
        Map<Integer, Integer> events = new HashMap<>();
        for (int[] interval : intervals) {
            int entry = interval[0];
            int exit = interval[1];
            events.put(entry, events.getOrDefault(entry, 0) + 1);
            events.put(exit, events.getOrDefault(exit, 0) - 1);
        }
        int currentGuests = 0;
        int maxGuests = 0;
        for (int time : events.keySet()) {
            currentGuests += events.get(time);
            maxGuests = Math.max(maxGuests, currentGuests);
        }
        return maxGuests;
    }
}

//Map<Integer, Integer> events = new HashMap<>();
//        for (int[] interval : intervals) {
//int entry = interval[0];
//int exit = interval[1];
//            events.put(entry, events.getOrDefault(entry, 0) + 1); // Въезд гостя
//        events.put(exit, events.getOrDefault(exit, 0) - 1);  // Выезд гостя
//        }
//int maxGuestsCount = 0;
//int currentGuests = 0;
//        for (int time : events.keySet()) {
//currentGuests += events.get(time);
//maxGuestsCount = Math.max(maxGuestsCount, currentGuests);
//        }
//
//                return maxGuestsCount;
