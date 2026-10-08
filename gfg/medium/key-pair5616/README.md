# key-pair5616

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T04:28:59.006Z  

```java
class Solution {
    boolean twoSum(int nums[],int target) {
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(hs.contains(target-nums[i]))
                return true;
            hs.add(nums[i]);
        }

        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/key-pair5616/1)