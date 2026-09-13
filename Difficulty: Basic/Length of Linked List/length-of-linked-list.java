/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        int c=0;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            c++;
        }
        return c+1;
    }
}