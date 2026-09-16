class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }

        int st=0,end=nums.length-1;
        int ans=-1;
        int mid=0;
        while(st<=end){
            mid=(st+end)/2;
            if(nums[mid]<target) st=mid+1;
            else if(nums[mid]>target) end=mid-1;
            else{
                ans=mid;
                end=mid-1;// if element = to target then search left side of the mid element is there any target element exsist. so that mid=mid-1;
            }

        }
        st=0;
        end=nums.length-1;
        int sans=-1;
        while(st<=end){
            mid=(st+end);
            if(nums[mid]<target) st=mid+1;
            else if(nums[mid]>target) end=mid-1;
            else{
                sans=mid;
                st=mid+1;// if element = to target then search right side of the mid element is there any target element exsist. so that st=mid+1;
            }

        }
        return new int[]{ans,sans};


        // else{
        //  int a=-1,b=-1;
        //     for(int i=0;i<nums.length;i++){
        //         if(nums[i]==target){
        //             a=i;
        //             break;
        //         }
        //     }
        //     for(int i=nums.length-1;i>=0;i--){
        //         if(nums[i]==target){
        //             b=i;
        //             break;
        //         }
        //     }
        // return new int[]{a,b};
        // }        
    }
}