class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int count =0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') {
                //System.out.println("In If "+count);
                count++;
                st.push(s.charAt(i));
            } else if(count>0) {
                //System.out.println("In Else If "+count);
                if(s.charAt(i) == ')' && st.pop()!='(') {
                    return Boolean.FALSE;
                }
                if(s.charAt(i) == '}' && st.pop()!='{') {
                    return Boolean.FALSE;
                }
                if(s.charAt(i) == ']' && st.pop()!='[') {
                    return Boolean.FALSE;
                }
                count--;
            } else {
                //System.out.println("In Else "+count);
                return Boolean.FALSE;
            }
        }
        //System.out.println(count);
        if(count==0) {
            return true;
        }
        return Boolean.FALSE;
    }
}
