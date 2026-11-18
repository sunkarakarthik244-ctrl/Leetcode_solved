class Solution {
    public int calculateScore(int a, int b) {
        String b1=Integer.toBinaryString(a);
        String b2=Integer.toBinaryString(b);
        int s1=0,s2=0;
        for(char ch:b1.toCharArray()){
            if(ch=='1') s1++;
        }     
        for(char ch:b2.toCharArray()){
            if(ch=='1') s2++;
        }
        if(s1>=s2) return s1*s2;
        return s2/s1;
    }
}