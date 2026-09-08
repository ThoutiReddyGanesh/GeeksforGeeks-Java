/* LinkedList Node structure
class Node {
    int data;   // data is either 0 or 1
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public int decimalValue(Node head) {
        // code here
       long up=0;

                   Node temp=head;
                   while(temp!=null){
                       up=(up*2+temp.data)%1000000007;

                       temp=temp.next;}
                       return (int) up;
                   }
               }