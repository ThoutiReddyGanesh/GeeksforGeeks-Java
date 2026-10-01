# Get Min from Stack

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Implement a class  **SpecialStack**  that supports following operations:

- push(x) – Insert an integer x into the stack.
- pop() – Remove the top element from the stack.
- peek() – Return the top element from the stack. If the stack is empty, return -1.
- getMin() – Retrieve the minimum element from the stack in O(1) time. If the stack is empty, return -1.
- isEmpty() –  Return true if stack is empty, else false

There will be a sequence of queries  **queries**  **[][]**. The queries are represented in numeric form:

- 1 x : Call push(x)
- 2:  Call pop()
- 3: Call peek()
- 4: Call getMin()
- 5: Call isEmpty()

The driver code will process the queries, call the corresponding functions, and print the outputs of peek(), getMin(), isEmpty() operations.
You only need to implement the above five functions.

 **Examples:** 

```
Input: q = 7, queries[][] = [[1, 2], [1, 3], [3], [2], [4], [1, 1], [4]]
Output: [3, 2, 1]
Explanation: 
push(2): Stack is [2]
push(3): Stack is [2, 3]
peek(): Top element is 3
pop(): Removes 3, stack is [2]
getMin(): Minimum element is 2
push(1): Stack is [2, 1]
getMin(): Minimum element is 1
```

```
Input: q = 5, queries[][] = [[1, 4], [1, 2], [4], [3], [5]]
Output: [2, 2, false]
Explanation: 
push(4): Stack is [4]
push(2): Stack is [4, 2]
getMin(): Minimum element is 2
peek(): Top element is 2
isEmpty(): false
```

 **Constraints:** 
1 ≤ q ≤ 105
0 ≤ values on the stack ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T19:28:24.757Z  

```java
class SpecialStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public SpecialStack() {
        // Define Stack
    }

    public void push(int x) {
        // Add an element to the top of Stack
        st.push(x);
        if(min.isEmpty() || x<=min.peek())
        min.push(x);
    }

    public void pop() {
        // Remove the top element from the Stack
        if(st.isEmpty())
            return ;
        if(st.peek().equals(min.peek()))
        min.pop();
        st.pop();
    }

    public int peek() {
        // Returns top element of the Stack
        if(st.isEmpty())
               return -1;
        return st.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return st.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if (min.isEmpty())
                return -1;
        return min.peek();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1)