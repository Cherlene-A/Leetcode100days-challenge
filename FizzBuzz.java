class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr =  new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5 ==0){
                arr.add(i-1,"FizzBuzz");
            }
            else if(i%3 ==0){
                arr.add(i-1,"Fizz");
            }
            else if(i%5==0){
                arr.add(i-1,"Buzz");
            }
            else{
                arr.add(i-1,Integer.toString(i));
            }
        }
        return arr;
    } 
}