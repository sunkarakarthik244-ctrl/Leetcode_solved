class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        List<Integer> ls=new ArrayList<>();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=num2.charAt(j)-'0';
                j--;
            }
            ls.addFirst(sum%10);
            carry=sum/10;
        }
        if(carry>0) ls.addFirst(carry);
        for(int k=0;k<ls.size();k++){
            sb.append(ls.get(k));
        }
        return sb.toString();
        
    }
}