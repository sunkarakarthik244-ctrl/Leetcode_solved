class Solution {
    public int firstMissingPositive(int[] nums) {
        // chatgpt lo chusa ra metta @ganesh 
        int[] res=new int[nums.length+1];
        for(int n:nums){
            if(n>0 && n<=nums.length){
                res[n]=1;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(res[i]==0){
                return i;
            }
        }
        return nums.length+1;
    }
}