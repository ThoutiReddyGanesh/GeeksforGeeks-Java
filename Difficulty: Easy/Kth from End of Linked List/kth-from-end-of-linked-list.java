/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node prev=null;
        Node temp=head;
        while(temp!=null){
            Node next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        temp=prev;
        for(int i=1;i<k;i++){
              if(temp == null)
            return -1;
            temp=temp.next;
        }
        if(temp == null)
            return -1;
            
        return temp.data;
    }
}