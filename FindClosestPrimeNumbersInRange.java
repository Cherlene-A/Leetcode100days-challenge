class Solution {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        int[] ans = new int[2];
        if(arr.size()<=1){
            ans[0]=-1;
            ans[1]=-1;
        }
        for(int i=0;i<arr.size()-1;i++){
            int diff = arr.get(i+1)-arr.get(i);
            if(diff<min){
                min=diff;
                ans[0]=arr.get(i);
                ans[1]=arr.get(i+1);
            }
        }
     return ans;   
    }
}