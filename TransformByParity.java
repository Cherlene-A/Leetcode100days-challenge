class Solution {
    public int[] transformArray(int[] nums) {
        int len = nums.length;
        for(int ind=0;ind<len;ind++){
            if(nums[ind]%2==0){
                nums[ind]=0;
            }
            else{
                nums[ind]=1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}