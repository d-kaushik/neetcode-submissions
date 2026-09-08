class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for(String word : strs) {
            char[] charArray = word.toCharArray();
            int[] count = new int[26];
            for(char c: charArray) {
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(word);
        }

        return new ArrayList<>(hm.values());
    }
}
