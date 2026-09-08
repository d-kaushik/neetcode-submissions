class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int maxFreq =0, left =0, right=0;
        int ans =0;

        while(right<s.length()) {
            char rightChar = s.charAt(right);
            hm.put(s.charAt(right), hm.getOrDefault(rightChar, 0)+1);
            maxFreq = Math.max(maxFreq, hm.get(rightChar));

            while((right-left+1)-maxFreq > k) {
                hm.put(s.charAt(left), hm.get(s.charAt(left))-1);
                left++;
            }

            ans = Math.max(ans, right-left+1);
            right++;
        }
        return ans;
    }
}
