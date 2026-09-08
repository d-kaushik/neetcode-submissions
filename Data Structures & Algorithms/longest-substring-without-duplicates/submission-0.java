class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int left=0, right=0;
        int len =0;

        while(right<s.length()) {
            char rightChar = s.charAt(right);
            while(set.contains(rightChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(rightChar);
            len = Math.max(len, right-left+1);
            right++;
        }
        return len;
    }
}
