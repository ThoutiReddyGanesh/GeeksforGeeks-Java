# Even at Even Index and Odd at Odd

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr[]**  of size  **n**  containing an equal number of even and odd integers, rearrange the array so that:

- Every even index contains an even number.
- Every odd index contains an odd number.

Return the rearranged array.

 **Note:**  There may be multiple valid answers. Return any one of them. Use 0-based indexing.

 **Examples:** 

```
Input: arr[] = [3, 6, 12, 1, 5, 8]
Output: [6, 3, 12, 1, 8, 5]
Explanation: The even indices (0, 2, 4) contain even numbers, and the odd indices (1, 3, 5) contain odd numbers.
```

```
Input: arr[] = [1, 2, 3, 4]
Output: [2, 1, 4, 3]
Explanation: The even indices contain even numbers, and the odd indices contain odd numbers.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T07:00:21.737Z  

```java
class Solution {
    public int[] reArrange(int[] nums) {
        // code here
        int i=0;
                int j=0;
                int temp=0;
                while(j<nums.length){
                    if(nums[j]%2==0){
                        temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        i++;
                    }
                    j++;
                }
                i=1;
                j=nums.length-2;
                temp=0;
                while(i<j){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i+=2;
                    j-=2;
                }
                return nums;
            }
        }
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/even-and-odd/1)