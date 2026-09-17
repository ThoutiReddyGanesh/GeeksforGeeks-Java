/* Structure of linked list Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
};*/
import java.util.*;
class Solution {
    public Node pairwiseSwap(Node head) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        for (int i = 0; i + 1 < list.size(); i += 2) {
            Collections.swap(list, i, i + 1);
        }
        Node nh=null;
        Node t=null;
        for(int x:list){
            Node n=new Node(x);
            if(nh==null){
                nh=n;
                t=n;}
                else{
                    t.next=n;
                    t=n;}
                
            }
            
            return nh;
        }
    
}