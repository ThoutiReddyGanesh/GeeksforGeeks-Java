# Maximum Average Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  and a positive integer  **k**, find the subarray of length k having the  **maximum** average value.

Return the  **starting** index of that subarray.

If multiple subarrays have the same maximum average, return the  **smallest** starting index.

 **Examples:** 

```
Input: k = 4, arr[] = [1, 12, -5, -6, 50, 3]
Output: 1
Explanation: Maximum average is (12 - 5 - 6 + 50)/4 = 51/4. Therefore answer for this test case is 1.
```

```
Input: k = 3, arr[] = [3, -435, 335, 10, -50, 100, 20]
Output: 2
Explanation: Maximum average is (335 + 10 - 50)/3 = 295/3. Therefore answer for this test case is 2.

```

 **Constraints** 
1 ≤ k ≤ arr.size() ≤ 105
-103 ≤ arr[i] ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T18:16:12.433Z  

```java
class Solution {
    public int findMaxAverage(List<Integer> arr, int k) {
        int sum=0;

        for(int i=0;i<k;i++)
            sum=sum+arr.get(i);

        int max=sum;
        int index=0;

        for(int i=k;i<arr.size();i++){
            sum=sum-arr.get(i-k)+arr.get(i);

            if(sum>max){
                max=sum;
                index=i-k+1;
            }
        }

        return index;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/maximum-average-subarray5859/1)