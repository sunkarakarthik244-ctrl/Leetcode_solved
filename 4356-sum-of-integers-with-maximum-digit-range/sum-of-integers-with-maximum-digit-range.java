class Solution {
    public int maxDigitRange(int[] nums) {
        int prediff=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
            int n=nums[i];
            while(n>0){
                int digit=n%10;
                if(digit<min){
                    min=digit;
                }
                if(digit>max){
                    max=digit;
                }
                n=n/10;

            }
            int diff=max-min;
            if(diff==prediff){
                ans+=nums[i];
            }
            if(diff>prediff){
                ans=0;
                ans+=nums[i];
                prediff=diff;
            }
            
        }
        return ans;
    }
}