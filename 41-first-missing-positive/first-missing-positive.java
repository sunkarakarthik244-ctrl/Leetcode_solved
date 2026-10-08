class Solution {
    public int firstMissingPositive(int[] nums) {
        // chatgpt lo chusa ra metta @ganesh 
        // int[] freq=new int[nums.length+1];
        // for(int i:nums){
        //     if(i>0 && i<=nums.length){
        //         freq[i]=1;
        //     }
        // }        
        // for(int i=1;i<freq.length;i++){
        //     if(freq[i]==0){
        //         return i;
        //     }
        // }
        // return nums.length+1;
        int[] res=Arrays.stream(nums).filter(n->n>0).toArray();
        Arrays.sort(res);
        int target=1;
        for(int n:res){
            if(n==target){
                target++;
            }
            else if(n>target){
                return target;
            }
        }
        return target;
    }
}