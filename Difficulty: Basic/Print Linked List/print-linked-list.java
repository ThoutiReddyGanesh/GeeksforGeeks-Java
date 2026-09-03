/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList <Integer> n = new ArrayList <Integer> ();
        Node temp=head;
        while(temp!=null){
            n.add(temp.data);
            temp=temp.next;
        }
        return n;
    }
}