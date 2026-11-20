class Solution {
    public boolean validDigit(int n, int x) {
        String s=Integer.toString(n);
        String s2=Integer.toString(x);
        if(s.startsWith(s2)) return false;
        return s.contains(s2)?true:false;
        
    }
}