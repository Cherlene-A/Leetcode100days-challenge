class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=len-k;i++){
            int wcount =0;
            for(int j=i;j<k+i;j++){
                if(blocks.charAt(j)=='W'){
                    wcount++;
                }
            }
            min=Math.min(min,wcount);
        }
        return min;
    }
}