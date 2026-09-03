/* Linked List Node Structure
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public static int getLength(Node head) {
        // code here
        int c=1;
        Node temp=head;
        while(temp.next!=head){
            temp=temp.next;
            c++;
        }
        return c;
    }
}