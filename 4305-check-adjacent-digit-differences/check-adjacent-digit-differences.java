class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            int val1=s.charAt(i)-'0';
            int val2=s.charAt(i+1)-'0';
            if(Math.abs(val1-val2)>2) return false;
        }
        return true;
        
    }
}