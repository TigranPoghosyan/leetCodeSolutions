package leetCodeSolutions.easyProblems.designHashMap706;

public class Solution {
    private static final int SIZE = 10000; // Size of the hash table
    private final Node[] table; // Array to hold the chains

    // Inner class for the nodes of the linked lists
    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    /**
     * Initialize your data structure here.
     */
    public Solution() {
        table = new Node[SIZE];
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        int index = getIndex(key);
        Node prev = findElement(index, key);

        if (prev.next == null)
            prev.next = new Node(key, value);
        else
            prev.next.value = value;
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        int index = getIndex(key);
        Node prev = findElement(index, key);

        return prev.next == null ? -1 : prev.next.value;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        int index = getIndex(key);
        Node prev = findElement(index, key);

        if (prev.next != null)
            prev.next = prev.next.next;
    }

    // Helper method to get the index in the array
    private int getIndex(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    // Helper method to find the element before the target key
    private Node findElement(int index, int key) {
        if (table[index] == null)
            return table[index] = new Node(-1, -1); // Create a dummy node to avoid null pointer exception

        Node prev = table[index];
        while (prev.next != null && prev.next.key != key) {
            prev = prev.next;
        }
        return prev;
    }
}
