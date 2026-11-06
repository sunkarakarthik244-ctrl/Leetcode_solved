class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            int len=s.length();
            if(len%2!=0){
                continue;
            }
            else{
                int left=0;
                int right=0;
                int mid=len/2;
                for(int j=0;j<mid;j++){
                    left+=s.charAt(j)-'0';
                    right+=s.charAt(j+mid)-'0';
                }
                if(left==right){
                    count++;
                }
            }
        }
        return count;
    }
}