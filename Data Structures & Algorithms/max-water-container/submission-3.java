class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length -1;
        int maximumArea = 0;

        while(left<right) {
            int area = Math.min(heights[left], heights[right]) *(right-left);
            maximumArea = Math.max(maximumArea, area);

            if(heights[left]> heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maximumArea;
    }
}
