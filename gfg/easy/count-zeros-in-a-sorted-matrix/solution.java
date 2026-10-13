class Solution {
    public int countZeros(int[][] grid) {
        // code here
        int c=0;
                for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid[i].length;j++){
                        if(grid[i][j]==0)c++;
                    }
                }
                return c;

            }
}
