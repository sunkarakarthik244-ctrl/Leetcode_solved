class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            String rev=new StringBuilder(String.valueOf(nums[i])).reverse().toString();
            set.add(Integer.parseInt(rev));
        }
        return set.size();
        
    }
}