class Solution {

    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();

        for(String str : strs) {
            s.append(str.length()).append(':').append(str);
        }

        return s.toString();
    }

    // public List<String> decode(String str) {
    //     List<String> ans = new ArrayList<>();
    //     int i =0;
    //     while(i<str.length()) {
    //         int strlen = Integer.parseInt(str.substring(i, i+1));
    //         int colonindex = str.indexOf(':', i);
    //         ans.add(str.substring(colonindex+1, colonindex+1+strlen));
    //         i = colonindex+1+strlen;
    //     }
    //     return ans;
    // }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            // Find the length of the next string
            int colonIndex = str.indexOf(':', i);
            int length = Integer.parseInt(str.substring(i, colonIndex));
            // Extract the string using the length
            String nextString = str.substring(colonIndex + 1, colonIndex + 1 + length);
            decoded.add(nextString);
            // Move the pointer past this string
            i = colonIndex + 1 + length;
        }
        return decoded;
    }
}
