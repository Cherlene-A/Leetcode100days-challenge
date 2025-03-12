class Solution {
    public int maximumCount(int[] nums) {
        int len=nums.length;
        int poscount=0;
        int negcount=0;
        for(int ctr =0;ctr<len;ctr++){
            if(nums[ctr] ==0){
                continue;
            }
            else if(nums[ctr]<0) negcount++;
            else poscount++;
        }
        return Math.max(poscount,negcount);
    }
}