class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls=new ArrayList<>();
        int m=matrix.length;//row lenght
        int n=matrix[0].length;//col length
        int left=0,right=n-1;
        int top=0,buttom=m-1;
        while(left<=right && top<=buttom){
            for(int i=left;i<=right;i++){
                ls.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=buttom;i++){
                ls.add(matrix[i][right]);
            }
            right--;
            if(top<=buttom){
                for(int i=right;i>=left;i--){
                    ls.add(matrix[buttom][i]);
                }
                buttom--;
            }
            if(left<=right){
                for(int i=buttom;i>=top;i--){
                    ls.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ls;
    }

}