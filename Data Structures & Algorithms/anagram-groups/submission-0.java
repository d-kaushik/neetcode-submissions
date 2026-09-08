class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for(String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String newWord = new String(charArray);
            hm.putIfAbsent(newWord, new ArrayList<>());
            hm.get(newWord).add(word);
        }

        return new ArrayList<>(hm.values());
    }
}
