class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int posi=i+1;
            int val=26-(s.charAt(i)-'a');
            int ans=posi*val;
            sum+=ans;
        }        
        return sum;
    }
}