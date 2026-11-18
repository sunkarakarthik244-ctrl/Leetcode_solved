class Solution {
    public int alternateDigitSum(int n) {
        String s=Integer.toString(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i)-'0';
            if(i%2==0){
                sum+=val;
            }
            else{
                sum-=val;
            }
        }
        return sum;
    }
}