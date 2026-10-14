# Spirally Traversing Matrix

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a rectangular matrix  **mat[][]**  of size  **n x m**, and return a 1D array containing all its elements in  **spiral** order.

 **Examples:** 

```
Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
Output: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
Explanation: 

```

```
Input: mat[][] = [[1, 2, 3, 4, 5, 6], [7, 8, 9, 10, 11, 12], [13, 14, 15, 16, 17, 18]]
Output: [1, 2, 3, 4, 5, 6, 12, 18, 17, 16, 15, 14, 13, 7, 8, 9, 10, 11]
Explanation: Applying same technique as shown above.
```

```
Input: mat[][] = [[32, 44, 27, 23], [54, 28, 50, 62]]
Output: [32, 44, 27, 23, 62, 50, 28, 54]
Explanation: Applying same technique as shown above, output will be [32, 44, 27, 23, 62, 50, 28, 54].
```

 **Constraints:** 
1 ≤ n, m ≤1000
0 ≤ mat[i][j] ≤100

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T13:12:49.855Z  

```java
class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] matrix) {
        // code here
               int left=0;
               int right=matrix[0].length-1;
               int top=0;
               int bottom=matrix.length-1;
               ArrayList <Integer> al=new ArrayList<>();
               while(left<=right && top<=bottom){
               for(int i=left;i<=right;i++)
                   al.add(matrix[top][i]);
                   top++;
               for(int i=top;i<=bottom;i++)
                   al.add(matrix[i][right]);
                   right--;
               for(int i=right;i>=left && top<=bottom;i--)
                   al.add(matrix[bottom][i]);
                   bottom--;
               for(int i=bottom;i>=top && left<=right;i--)
                   al.add(matrix[i][left]);
                   left++;
               }
           return al;


           }
       }
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1)