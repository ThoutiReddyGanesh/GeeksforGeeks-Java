/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        int c=0;
        Node temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;}
            if(c==1)
                        return null;
            temp=head;
           if(c%2==1){
                for(int i=0;i<(c-1)/2-1;i++)
                    temp=temp.next;
                   }
            else{
                for(int i=0;i<c/2-1;i++)
                    temp=temp.next;
                   }
            
            temp.next=temp.next.next;
         return head;   
        }
    }
