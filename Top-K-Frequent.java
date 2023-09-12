// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
   
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.computeIfAbsent(num, s -> 0);
            map.computeIfPresent(num, (key, value) -> value + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Define a custom Comparator to sort by value (frequency) in descending order
        Comparator<Map.Entry<Integer, Integer>> comparator = (entry1, entry2) ->
                entry2.getValue().compareTo(entry1.getValue());

        entryList.sort(comparator);

        int[] result = new int [k];

        for(int i = 0; i < k; i++){
            result[i] = entryList.get(i).getKey();
        }

        return result;

    }
}
