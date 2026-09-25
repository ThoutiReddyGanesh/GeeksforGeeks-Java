# Hour and Minute Hands Angle

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string s representing time in 24-hour format "HH:MM", compute the smallest angle in degrees between the hour and minute hands of an analog clock.

 

 **Examples:** 

```
Input: s = "06:00"
Output: 180.000
Explanation: When the time is 06:00, the angle between the hour and minute hands of the clock is 180.000 degrees.
```

```
Input: s = "03:15"
Output: 7.500
Explanation: When the time is 03:15, the angle between the hour and minute hands of the clock is 7.500 degrees.
```

**Constraints:
**s.size() = 5
00 ≤  HH  ≤ 23
00 ≤  MM  ≤ 59

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T08:22:30.365Z  

```js
class Solution {
    getAngle(s) {
        // code here
        let h=Number(s.substring(0, 2));
        let m=Number(s.substring(3, 5));
        h=h%12;
        let angle = Math.abs(30 * h - 5.5 * m);
        if(angle>180)
            angle=360-angle;

        return angle;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/angle-between-hour-and-minute-hand0545/1)