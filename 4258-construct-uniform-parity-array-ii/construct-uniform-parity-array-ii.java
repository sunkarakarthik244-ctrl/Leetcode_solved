class Solution {
    public boolean uniformArray(int[] nums1) {
        int mineven=Integer.MAX_VALUE;
        int minodd=Integer.MAX_VALUE;
        boolean even=false;
        boolean odd=false;
        for(int ele:nums1){
            if(ele%2==0){
                even=true;
                mineven=Math.min(mineven,ele);
            }
            else{
                odd=true;
                minodd=Math.min(minodd,ele);
            }
        }
        int min=Math.min(mineven,minodd);
        if(min%2==0){
            if(odd) return false;
        }
        return true;
        
        
    }
}