# Inorder Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a  **root** of a Binary Tree, your task is to return its Inorder Traversal.

 **Note:** An inorder traversal first visits the left child (including its entire subtree), then visits the node, and finally visits the right child (including its entire subtree).

 **Examples:** 

```
Input: root = [1, 2, 3, 4, 5]
            
Output: [4, 2, 5, 1, 3]
Explanation: The inorder traversal of the given binary tree is [4, 2, 5, 1, 3].
```

```
Input: root = [8, 1, 5, N, 7, 10, 6, N, 10, 6]
              
Output: [1, 7, 10, 8, 6, 10, 5, 6]
Explanation: The inorder traversal of the given binary tree is [1, 7, 10, 8, 6, 10, 5, 6].
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T15:34:27.667Z  

```java
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
     ArrayList<Integer>al=new ArrayList<>();
    public ArrayList<Integer> inOrder(Node root) {
        // code here
         if(root==null) return al;

                inOrder(root.left);
                al.add(root.data);
                inOrder(root.right);
            return al;

            }
        }
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/inorder-traversal/1)