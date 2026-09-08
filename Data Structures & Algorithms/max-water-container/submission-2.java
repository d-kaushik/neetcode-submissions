class Solution {
    public int maxArea(int[] heights) {
        int left =0;
        int right = heights.length -1;
        int maximumArea = 0;

        while(left<right) {
            int smallElement = (heights[left]<heights[right]) ? heights[left] : heights[right];
            int area = smallElement *(right-left);
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
