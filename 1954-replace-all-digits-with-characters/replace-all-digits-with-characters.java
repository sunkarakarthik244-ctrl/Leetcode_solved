class Solution {
    public String replaceDigits(String s) {
        if(s.length()==1) return s;
        char[] ch=new char[s.length()];
        for(int i=1;i<s.length();i+=2){
            ch[i-1]=s.charAt(i-1);
            ch[i]=(char) (s.charAt(i-1)+(s.charAt(i)-'0'));
            if(i==s.length()-2){
                ch[i+1]=(char) s.charAt(i+1);
            }
        }
        return new String(ch);
        
    }
}