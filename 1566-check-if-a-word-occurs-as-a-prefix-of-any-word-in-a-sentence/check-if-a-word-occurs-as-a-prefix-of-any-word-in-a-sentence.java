class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        // Split the sentence into an array of words
        String[] s=sentence.split(" ");
        // Iterate through the array of words
        for(int i=0;i<s.length;i++){
            if(s[i].startsWith(searchWord)) return i+1;
        }
        return -1;
        
    }
}