class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            String bstring=String.format("%8s",Integer.toBinaryString(ascii)).replace(' ','0');
            sb.append(bstring);
        }
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;
        
    }
}