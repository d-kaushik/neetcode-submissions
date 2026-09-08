class Solution {
    public int trap(int[] height) {
        int left=0, leftMax=height[0], rightMax=height[height.length-1];
        int right= height.length;
        int maxArea=0;

        while(left<right) {
            if(leftMax<rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                maxArea += (leftMax-height[left]);
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                maxArea += (rightMax-height[right]);
            }
        }
        return maxArea;
    }
}
