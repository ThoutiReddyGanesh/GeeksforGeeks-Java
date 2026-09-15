/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
import java.util.*;
class Solution {
    public int getNode(Node head, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

               Node temp = head;

               while (temp != null) {
                   list.add(temp.data);
                   temp = temp.next;
               }
               
               if (k <= 0 || k > list.size()) 
                   return -1;
               
               
        return    list.get(k-1);
            

    }
}