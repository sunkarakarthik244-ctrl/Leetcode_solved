class Solution {
    public String longestPalindrome(String s) {
        
    
        String st="";
        int len=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalin(s,i,j)){
                    len=j-i+1;
                    if(len>max){
                        st=s.substring(i,j+1);
                        max=len;
                    }

                }
            }
        }
        return st;
        
    }
    public boolean isPalin(String s,int i,int j){
        int mid=i+j+1;
        int left=(mid-1)/2;
        int right=mid/2;
        while(left>=i && right<=j){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left--;
            right++;
        }
        return true;
    }
}