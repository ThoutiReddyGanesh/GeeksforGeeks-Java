/* Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node headRef) {
        // code here
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        
        Node temp=headRef;
        while(temp!=null){
            lhs.add(temp.data);
            temp=temp.next;}
        
    Node nh=null;
    Node t=null;
    for(int x: lhs){
            Node n=new Node(x);
    if(nh==null){
        nh=n;
        t=n;}
        else{
            t.next=n;
            t=n;
        }
    }
    return nh;
        
    }
}