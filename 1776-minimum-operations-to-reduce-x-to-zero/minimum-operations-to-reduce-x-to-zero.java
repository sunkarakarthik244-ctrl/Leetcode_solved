class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int val:nums){
            total+=val;
        }
        int k=total-x;
        if(k==0) return nums.length;
        int l=0,r=0;
        int maxlen=-1;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>k && l<=r){
                sum-=nums[l];
                l++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r++;
        }
        if(maxlen<=0) return -1;
        return (nums.length-maxlen);
        
    }
}