# Score of Parentheses String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**  consisting of balanced parentheses, calculate the  **score**  of the string based on the following rules:

- "()" has a score of 1.
- "AB" has a score of A + B, where A and B are balanced parentheses strings.
- "(A)" has a score of 2 × score(A), where A is a balanced parentheses string.

 **Note:** Test cases are generated such that the score will fit within a 32-bit integer.

 **Examples:** 

```
Input: s = "()()"
Output: 2
Explanation: The string str is of the form "ab", that makes the total score = (score of a) + (score of b) = 1 + 1 = 2.
```

```
Input: s = "(()(()))"
Output: 6
Explanation: The string str is of the form "(a(b))" which makes the total score = 2 × ((score of a) + 2 × (score of b)) = 2 × (1 + 2 × (1)) = 6.
```

```
Input: s = "((()))"
Output: 4
Explanation: The string str is of the form "((a))" which makes the total score = 2 × (2 × (score of a)) = 2 × (2 × (1)) = 4.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105
s[i] ∈ { '(', ')' }

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T12:58:21.474Z  

```java
class Solution {
    public int scoreOfParentheses(String s) {
        // code here
        
   int score=0;int c=0;
           for(int i=0;i<s.length();i++){
               if(s.charAt(i)=='(') c++;
               else {c--;
           if(s.charAt(i-1)=='(') score=score+(int)Math.pow(2,c);
           }
           }
       return score;
       }
   }
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/score-of-parentheses-string/1)