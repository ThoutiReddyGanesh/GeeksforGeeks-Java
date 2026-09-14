/*class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public Node insertIntoEmpty(Node last, int data) {
        // code here
        Node n=new Node(data);
        if(last==null){n.next=n;return n;}
        return last;
    }
}
