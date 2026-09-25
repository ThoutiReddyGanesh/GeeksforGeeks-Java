# AP Term

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given three integers  **a, d**  and  **n.** Where  **a**  is the first term,  **d**  is the common difference of an  **A.P.**  Calculate the  **n** th term of A.P. 
The nth term is given by an = a + (n-1)d

 **Examples:** 

```
Input: a = 5, d = 2, n = 5
Output: 13
Explanation: anth = a + (n-1)d = 5 + (5-1)*2 = 5 + 8 = 13
```

```
Input: a = 10, d = 10, n = 101 
Output: 1010 
Explanation: anth = a + (n-1)d = 10 + (101-1)*10 = 10 + 1000 = 1010.

```

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T08:22:26.196Z  

```js
const fs = require("fs");
const input = fs.readFileSync(0, "utf8").trim().split(/\s+/).map(Number);
let a = input[0];
let d = input[1];
let n = input[2];

// code here
console.log(a+(n-1)*d);

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/ap-term--150919/1)