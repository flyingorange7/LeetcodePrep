class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int total = row*col;
        
        int[] ans = new int[total];
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(k < total){
            while(i > 0 && j < col -1)
                ans[k++] = mat[i--][j++];

            ans[k++] = mat[i][j];
            
            if(j == col -1)
                i++;
            else
                j++;
            
            if(k >= total)
                break;
            
            while(i < row -1 && j > 0)
                ans[k++] = mat[i++][j--];
            
            ans[k++] = mat[i][j];
            
            if(i == row -1)
                j++;
            else
                i++;
        }
        
        return ans;
    }
}