class Solution {
    public int findNumbers(int[] nums) {
        int len = nums.length;
        int[] counts = new int[len];

        for(int i = 0; i < len; i++) {
            int temp = nums[i];
            int digitCount = 0;
            while(temp != 0) {
                temp /= 10;
                digitCount++;
            }
            counts[i] = digitCount;
        }

        int c = 0;
        for(int j = 0; j < len; j++) {
            if(counts[j] % 2 == 0) c++;
        }

        return c;
    }
}
