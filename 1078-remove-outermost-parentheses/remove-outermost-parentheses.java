class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
                if(count>1) sb.append(ch);
            }
            else{
                if(count>1) sb.append(ch);
                count--;
            }
        }
        return sb.toString();
        // Stack<Character> st=new Stack<>();
        // for(char ch:s.toCharArray()){
        //     if(ch=='('){
        //         if(!st.isEmpty()){
        //             sb.append(ch);
        //         }
        //         st.push(ch);
        //     }
        //     else{
        //         st.pop();
        //         if(!st.isEmpty()){
        //             sb.append(ch);
        //         }
        //     }
            
        // }
        // return sb.toString();
        
    }
}