class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> ls=new ArrayList<>();
        ls.add(nums[0]);
        int freq=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }
            else{
                freq=1;
            }
            if(freq<=k){
                ls.add(nums[i]);
            }
        }
        int[] ans=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            ans[i]=ls.get(i);
        }
        return ans;
        
    }
}