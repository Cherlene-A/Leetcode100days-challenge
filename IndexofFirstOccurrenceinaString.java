class Solution {
    public int strStr(String haystack, String needle) {
        int hsize = haystack.length() , nsize = needle.length();
        for(int i= 0, j=nsize; j<=hsize;i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}