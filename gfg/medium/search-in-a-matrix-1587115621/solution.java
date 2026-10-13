class Solution {
    public boolean searchMatrix(int[][] grid, int target) {
        // code here
        for(int i=0;i<grid.length;i++){
                    for(int j=0;j<grid[i].length;j++){
                        if(grid[i][j]==target)return true;
                    }
                }
                return false;

            }
        }
