class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum=0;
        int digitsquare=0;
        while(n>0){
            int digit=n%10;
            digitsum+=digit;
            digitsquare+=digit*digit;
            n=n/10;
        }
        return (digitsquare-digitsum)>=50;
        
    }
}