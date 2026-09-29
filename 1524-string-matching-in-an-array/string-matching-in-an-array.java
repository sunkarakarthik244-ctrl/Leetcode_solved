class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ls=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].contains(s)){
                    ls.add(s);
                    break;
                }
            }
        }
        return ls;
    }
}