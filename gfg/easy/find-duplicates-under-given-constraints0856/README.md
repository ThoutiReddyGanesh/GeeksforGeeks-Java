# Majority in a Sorted Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sorted array  **arr[]**  of size  **n**, determine whether there is a majority element in the array or not. An element is called a majority element if it appears more than n/2 times in the array.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 3, 3, 3, 10]
Output: true
Explanation: The size of the array is 7. The middle element is arr[7/2] = arr[3] = 3. Element 3 appears 4 times. Since 4 > (7 / 2), it is a majority element.
```

```
Input: arr[] = [1, 1, 2, 4, 4, 4, 6, 6]
Output: false
Explanation: The size of the array is 8. The middle element is arr[8/2] = arr[4] = 4. Element 4 appears 3 times. Since 3 is not greater than (8 / 2), it is not a majority element.
```

**Constraints:
**1 ≤ n ≤ 105
1 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T10:59:11.607Z  

```java
class Solution {
    public boolean isMajority(int[] arr) {
        // code here
        int n=arr.length/2;
        int c=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]==arr[n]) c++;i++;
            
        }
        if(c>n) return true;
        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-duplicates-under-given-constraints0856/1)