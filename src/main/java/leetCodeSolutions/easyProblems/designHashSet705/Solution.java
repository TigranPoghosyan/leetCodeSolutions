package leetCodeSolutions.easyProblems.designHashSet705;

import java.util.Arrays;

public class Solution {
    private final boolean[] hashSet;

    public Solution() {
        hashSet = new boolean[1000001];
        Arrays.fill(hashSet, false);
    }

    public void add(int key) {
        hashSet[key] = true;
    }

    public void remove(int key) {
        hashSet[key] = false;
    }

    public boolean contains(int key) {
        return hashSet[key];
    }
}
