# Count of Subarrays

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array  **arr[]** of positive integers and an integer  **k**. The special value of each contiguous subarray of given array is the maximum element present in that subarray.

Return the number of subarrays having special value strictly greater than k.

 **Note :**  Since the answer can be very large, return it modulo 109+7.

 **Examples:** 

```
Input: k = 2, arr[] = [3, 2, 1]
Output: 3
Explanation: The subarrays having value strictly greater than K are: [3], [3, 2] and [3, 2, 1]. Thus there are 3 such subarrays.

```

```
Input: k = 1, arr[] = [1, 2, 3, 4]
Output: 9
Explanation: There are 9 subarrays having value strictly greater than K.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T13:28:43.737Z  

```java
class Solution {
    public int countSubarray(int[] arr,int k) {
        int c=0;
        int mod=1000000007;

        for(int i=0;i<arr.length;i++){
            int max=0;

            for(int j=i;j<arr.length;j++){
                max=Math.max(max,arr[j]);

                if(max>k)
                    c=(c+1)%mod;
            }
        }

        return c;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-of-subarrays5922/1)