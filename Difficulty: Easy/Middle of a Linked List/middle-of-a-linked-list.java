/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        int c=0;
        Node temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
            }
            temp=head;

            for(int i=0;i<c/2;i++){

            temp=temp.next;

            }


        return temp.data;

    }
}