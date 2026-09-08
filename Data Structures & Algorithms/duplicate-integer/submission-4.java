class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> duplicate = new HashSet<>();
        for(int num: nums) {
            if(!duplicate.add(num)) {
                return true;
            }
        }
        return false;
    }
}