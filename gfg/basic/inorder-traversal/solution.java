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