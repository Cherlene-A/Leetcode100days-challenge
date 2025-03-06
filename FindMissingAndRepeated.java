class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len=grid.length;
        int sum=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        int ans[] = new int[2];
        for(int ind1 =0;ind1<len;ind1++){
            for(int ind2 = 0 ;ind2<len;ind2++){
                sum+=grid[ind1][ind2];
                if(!(hs.contains(grid[ind1][ind2]))){
                    hs.add(grid[ind1][ind2]);
                }
                else{
                    ans[0]=grid[ind1][ind2];
                }
            }
        }
        sum=sum-ans[0];
        int total=0;
        for(int i=1;i<=len*len;i++){
            total+=i;
        }
        ans[1]=total-sum;
        return ans;
    }
}