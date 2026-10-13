class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]>2) return false;
        }
        return true;
        // int n=nums.length;
        // List<Integer> ls1=new ArrayList<>();
        // List<Integer> ls2=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(!ls1.contains(nums[i])){
        //         ls1.add(nums[i]);
        //     }
        //     else if(!ls2.contains(nums[i])){
        //         ls2.add(nums[i]);
        //     }
        //     else{
        //         return false;
        //     }
        // }
        // return true;
        

        
    }
}