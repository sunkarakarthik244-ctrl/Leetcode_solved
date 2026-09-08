class Solution {
    public int countCommas(int n) {
        if(String.valueOf(n).length()<=3) return 0;
        return Math.abs(1000-n)+1;

    }
}