class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();

        for(String str : strs) {
            s.append(str.length()).append(':').append(str);
        }

        return s.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i =0;
        while(i<str.length()) {
            int colonindex = str.indexOf(':', i);
            int strlen = Integer.parseInt(str.substring(i, colonindex));
            ans.add(str.substring(colonindex+1, colonindex+1+strlen));
            i = colonindex+1+strlen;
        }
        return ans;
    }


}
