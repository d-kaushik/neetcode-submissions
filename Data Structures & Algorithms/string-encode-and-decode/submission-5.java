class Solution {

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();

        for(String str : strs) {
            stringBuilder.append(str.length()).append(':').append(str);
        }

        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        int i=0;
        List<String> ans = new ArrayList<>();

        while(i < str.length()) {
            int colonIndex = str.indexOf(':',i);
            int len = Integer.parseInt(str.substring(i, colonIndex));
            ans.add(str.substring(colonIndex+1, colonIndex+1+len));
            i = colonIndex+1+len;
        }

        return ans;
    }


}
