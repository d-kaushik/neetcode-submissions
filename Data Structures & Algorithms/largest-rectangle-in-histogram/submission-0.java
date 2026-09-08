class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = Integer.MIN_VALUE;

        for(int i=0; i<heights.length; i++) {
            int current = heights[i];
            while(!stack.isEmpty() && heights[stack.peek()]>=current) {
                int height = heights[stack.pop()];
                int width = i - (stack.isEmpty()? -1 : stack.peek()) -1;
                maxArea = Math.max(maxArea, height*width);
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = heights.length- (stack.isEmpty()? -1 : stack.peek()) -1;
            maxArea = Math.max(maxArea, height*width);
        }

        return maxArea;
    }
}
