class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> hm = new HashMap<>();

        hm.put(')','(');
        hm.put(']','[');
        hm.put('}','{');

        for(int i=0; i<s.length(); i++) {
            if(hm.containsKey(s.charAt(i))) {
                if(st.isEmpty() || st.peek()!=hm.get(s.charAt(i))) {
                    return false;
                }
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        return st.isEmpty();
    }
}
