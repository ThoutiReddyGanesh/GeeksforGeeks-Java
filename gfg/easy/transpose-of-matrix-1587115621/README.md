# Transpose of Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a square matrix of size  **n x n**, return the **transpose**  matrix of the given matrix.

The  **transpose**  of a matrix is obtained by converting all the rows to columns and all the columns to rows.

 **Examples:** 

```
Input: mat[][] = [[1, 1, 1, 1], [2, 2, 2, 2], [3, 3, 3, 3], [4, 4, 4, 4]]
Output: [[1, 2, 3, 4], [1, 2, 3, 4], 1, 2, 3, 4], [1, 2, 3, 4]]
Explanation: Converting rows into columns and columns into rows.
```

```
Input: mat[][] =  [[1, 2], [9, -2]]
Output: [[1, 9], [2, -2]]
Explanation: Converting rows into columns and columns into rows.
```

 **Constraints:** 
1 ≤ n ≤ 103
-109 ≤ mat[i][j] ≤109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:40:20.347Z  

```java
class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();

        for(int i=0;i<mat[0].length;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<mat.length;j++){
                temp.add(mat[j][i]);
            }
            al.add(temp);
        }

        return al;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1)