class Solution {
    public long countCommas(long n) {
        long comascount=0;
        long base=1000;
        while(n>=base){
            comascount+=(n-base)+1;
            base*=1000;
        }        
        return comascount;
    }
}