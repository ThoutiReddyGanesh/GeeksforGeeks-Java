/* Linked List Node Structure
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/

class Solution {
    public int modularNode(Node head, int k) {
        int c=1;
        int ans=-1;
        Node temp=head;

        while(temp!=null){
            if(c%k==0){
                ans=temp.data;
            }
            c++;
            temp=temp.next;
        }

        return ans;
    }
}