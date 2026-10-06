# Compress String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, compress it by replacing each group of consecutive identical characters with the lowercase character followed by its frequency.

- Uppercase and lowercase versions of the same letter are treated as identical.
- If the same character appears again after a different character, it forms a new group.

 **Examples:** 

```
Input: s = "aaABBb"
Output: "a3b3"
Explanation: Treating uppercase and lowercase letters as the same, the string becomes "aaabbb". Thus, 'a' appears 3 times consecutively, followed by 'b' appearing 3 times.

```

```
Input: s = "aaacca"
Output: "a3c2a1"
Explanation: The first three 'a' characters form one group, followed by two 'c' characters. The last 'a' forms a separate group since it is not consecutive with the first one.
```

 **Constraints:** 
1 ≤ |s| ≤ 105
s contains only lowercase and uppercase characters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T11:19:53.977Z  

```java
class Solution {
    public String compressString(String s) {
        int i=0;
        int j=0;
        int c=0;
        String d="";

        while(j<s.length()){
            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                c++;
                j++;
            }
            else{
                d+=Character.toLowerCase(s.charAt(i));
                d+=c;
                c=0;
                i=j;
            }
        }

        d+=Character.toLowerCase(s.charAt(i));
        d+=c;

        return d;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/easy-string2212/1)