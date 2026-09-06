class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int[] mina=new int[n];
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            mina[i]=min;
        }
        int max=nums[0];
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            int diff=max-mina[i];
            if(diff<=k) return i;
        }
        return -1;
        // for(int i=0;i<nums.length;i++){
        //     int max=Integer.MIN_VALUE;
        //     int min=Integer.MAX_VALUE;
        //     int maxi=i;
        //     while(maxi>=0){
        //         max=Math.max(max,nums[maxi]);
        //         maxi--;
        //     }
        //     int mini=i;
        //     while(mini<nums.length){
        //         min=Math.min(min,nums[mini]);
        //         mini++;
        //     }
        //     int diff=max-min;
        //     if(diff<=k) return i;
        // }
        // return -1;   
    }
}