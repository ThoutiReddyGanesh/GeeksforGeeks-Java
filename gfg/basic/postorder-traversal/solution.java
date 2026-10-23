/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    ArrayList<Integer>al=new ArrayList<>();
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        if(root==null) return al;

                postOrder(root.left);
                postOrder(root.right);
                al.add(root.data);
            return al;

            }
        }