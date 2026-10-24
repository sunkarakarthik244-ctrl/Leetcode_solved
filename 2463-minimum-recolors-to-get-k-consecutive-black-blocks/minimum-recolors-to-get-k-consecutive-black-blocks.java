class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W') count++;
        }
        System.out.println(count);
        int mincount=count;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(l)=='W'){
                count--;
            }
            if(blocks.charAt(i)=='W'){
                count++;
            }
            l++;
            mincount=Math.min(mincount,count);
        }
        return mincount;
        
    }
}