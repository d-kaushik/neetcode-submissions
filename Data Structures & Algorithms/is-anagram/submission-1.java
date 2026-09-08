class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int [] arr_s = new int[26];

        for(int i=0; i<s.length(); i++){
            arr_s[s.charAt(i)-'a']++;
            arr_s[t.charAt(i)-'a']--;
        }

        for(int i=0; i<26; i++){
            if(arr_s[i] != 0){
                return false;
            }
        }
        return true;
    }
}
