class Solution {
    public int subsetXORSum(int[] nums) {
        int tot =0;
        for(int i : nums){
            tot |= i;
        }
        return tot*(1<<(nums.length-1));
    }
}