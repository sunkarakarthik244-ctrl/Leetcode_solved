class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;


        //bruteforce Approach
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=target-nums[i];
            if(!map.containsKey(val)){
                map.put(nums[i],i);
            }
            else{
                return new int[]{map.get(val),i};
            }
        }
        return new int[]{};

        
        
    }
}