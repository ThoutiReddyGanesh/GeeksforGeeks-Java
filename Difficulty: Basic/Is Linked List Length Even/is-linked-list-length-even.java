/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
        // code here
        int c=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
   if(c%2==0) return true;
   return false;
    }
}