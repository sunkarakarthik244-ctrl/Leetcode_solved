class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!ls1.contains(nums[i])){
                ls1.add(nums[i]);
            }
            else if(!ls2.contains(nums[i])){
                ls2.add(nums[i]);
            }
            else{
                return false;
            }
        }
        return true;
        // int[] n1=new int[n/2];
        // int[] n2=new int[n/2];
        // for(int i=0;i<ls1.size();i++){
        //     n1[i]=ls1.get(i);
        // }
        // for(int i=0;i<ls2.size();i++){
        //     n2[i]=ls2.get(i);
        // }

        
    }
}