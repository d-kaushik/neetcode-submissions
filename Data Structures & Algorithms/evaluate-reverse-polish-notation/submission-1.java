class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ans =0;

        for(String token: tokens) {
            
            if(token.equals("+") ||token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                ans = a+b;

                if(token.equals("+")) 
                    stack.push(a+b);
                else if(token.equals("-")) 
                    stack.push(a-b);
                else if(token.equals("*")) 
                    stack.push(a*b);
                else if(token.equals("/"))
                    stack.push(a/b);
        
            } else {
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.pop();
    }
}
