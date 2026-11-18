class Solution {
    public int getLeastFrequentDigit(int n) {
        String s=Integer.toString(n);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            int val=ch-'0';
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int key:map.keySet()){
            if(map.get(key)<min){
                min=map.get(key);
                ans=key;
            }
        }
        return ans;
        
    }
}