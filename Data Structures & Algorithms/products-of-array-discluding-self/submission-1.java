class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        boolean oneTimeZero = false;
        boolean twoTimeZero = false;
        int[] ans = new int[nums.length];

        for(int num: nums) {
            if(num==0) {
                twoTimeZero = oneTimeZero ? true : false; 
                oneTimeZero = true;
                continue;
            }
            product = product * num;
        }
        
        if(twoTimeZero) {
            Arrays.fill(ans,0);
            return ans;
        } 

        for(int i=0; i<ans.length; i++) {
            if(nums[i]==0){
                ans[i] = product;
                continue;
            }
            ans[i] = oneTimeZero ? 0 : (product/nums[i]);
        }

        return ans;
    }
}  
