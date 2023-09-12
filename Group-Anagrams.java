// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] test = s.toCharArray();
            Arrays.sort(test);
            String string = new String(test);

            if(!map.containsKey(string)){
                map.put(string, new ArrayList<>());
            }

            map.get(string).add(s);
        }
        
               return new ArrayList<>(map.values());
    }
}
