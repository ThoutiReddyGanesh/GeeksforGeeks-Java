# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return  **the median**  of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

 **Example 1:** 

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

 **Example 2:** 

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

 **Constraints:** 

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 23.35%)  
**Memory:** 48.9 MB (beats 51.79%)  
**Submitted:** 2026-09-25T18:00:17.860Z  

```java
class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        int arr[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
                arr[i]=a[i];
        for(int i=0;i<b.length;i++)
                arr[a.length+i]=b[i];

        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==0)
        return (arr[n/2-1]+arr[n/2])/2.0;
        else return arr[n/2];
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)