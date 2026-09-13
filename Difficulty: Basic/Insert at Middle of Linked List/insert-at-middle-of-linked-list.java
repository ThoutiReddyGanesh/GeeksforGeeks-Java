/* Structure of a linked list node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // code here
        int c=0;
        Node n=new Node(x);
        if(head==null) return n;
          Node temp=head;
          while(temp!=null){
            c++;
            temp=temp.next;
                 }
             temp=head;     

          for(int i=0;i<(c-1)/2;i++){
                temp=temp.next;}
                n.next=temp.next;
                temp.next=n;
            
            return head;
        }
}