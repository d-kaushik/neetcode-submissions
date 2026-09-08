class Solution {
    public boolean isAnagram(String s, String t) {

        int [] arr_s = new int[26];
        int [] arr_t = new int[26];

        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            arr_s[s.charAt(i)-'a']++;
        }
        for(int i=0; i<t.length(); i++){
            arr_t[t.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++){
            if(arr_s[i] != arr_t[i]){
                return false;
            }
        }
        return true;
    }
}
