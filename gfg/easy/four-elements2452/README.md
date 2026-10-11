# Check for 4 Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr[]**  and an integer  **x**, determine whether there exist four distinct elements in the array whose sum is equal to x.

Return true if such four elements exist. Otherwise, return false.

 **Examples:** 

```
Input: arr[] = [1, 5, 1, 0, 6, 0], x = 7
Output: true
Explanation: The four elements 1, 5, 1, 0 have a sum equal to 7.

```

```
Input: arr[] = [1, 2, 3, 4, 5], x = 50
Output: false
Explanation: No combination of four distinct elements has a sum equal to 50.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T06:59:51.205Z  

```java
class Solution{
    public boolean fourSum(int[] arr,int x){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1;
                int r=n-1;
                while(l<r){
                    long sum=(long)arr[i]+arr[j]+arr[l]+arr[r];
                    if(sum==x) return true;
                    else if(sum<x) l++;
                    else r--;
                }
            }
        }
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/four-elements2452/1)