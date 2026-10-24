class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int t_sum=nums[0];
        int[] left=new int[n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            t_sum+=nums[i];
            left[i]=left[i-1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(t_sum-left[i]==0) return 0;
            }
            else{
                int target=t_sum-left[i];
                if(target==left[i-1]){
                    return i;
                }
            }
        }
        return -1;
    }
}