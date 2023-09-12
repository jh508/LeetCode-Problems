// Problem: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nonDuplicates = new HashSet<Integer>();

        for (int num : nums) {
            if (nonDuplicates.contains(num)) {
                return true;
            }
            nonDuplicates.add(num);
        }
        return false;
    }
}
