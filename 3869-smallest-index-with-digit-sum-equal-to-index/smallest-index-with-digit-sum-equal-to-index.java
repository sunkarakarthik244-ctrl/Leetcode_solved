class Solution {
    public int smallestIndex(int[] nums) {
        if(nums[0]==0) return 0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            if(sum==i){
                min=Math.min(min,i);
            }
            else{
                sum=0;
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
    }
}