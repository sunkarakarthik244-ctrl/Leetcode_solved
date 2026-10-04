class Solution {
    public boolean validPalindrome(String s) {
        // qls lo vakka sari matrame character ni delete cheyali. so eppudaite not equal avtundo then checks new palindrome logic again. whenever calls new logic at that time not equals condition meets then return false or return true
    //     int l=0,r=s.length()-1;
    //     while(l<r){
    //         if(s.charAt(l)!=s.charAt(r)){  
    //             // here not equals condition meet so immediatly call new palindrome logic.
    //             if(isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1)){
    //                 return true;
    //             }
    //             return false;
    //         }
    //        l++;
    //        r--;
    //     }
    //     return true;
    // }
    // public boolean isPalindrome(String s,int st,int end){
    //     while(st<end){
    //         if(s.charAt(st)!=s.charAt(end)){ // here not equals then return false
    //             return false;
    //         }
    //         st++;
    //         end--;
    //     }
    //     return true;//  or else return true


        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                if(isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1)){
                    return true;
                }
                return false;

            }
            l++;
            r--;
        }
        return true;
    }
        public boolean isPalindrome(String s,int left,int right){
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
}