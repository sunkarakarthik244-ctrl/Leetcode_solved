class Solution {
    public int countCommas(int n) {
        int totalcomas=0;
        int base=1000;
        while(n>=base){
            totalcomas+=(n-1000)+1;
            base*=1000;
        }
        return totalcomas;

    }
}