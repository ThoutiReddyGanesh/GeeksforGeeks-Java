/* Definition of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

import java.util.*;

class Solution {
    public Node sortedInsert(Node head, int key) {

        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        list.add(key);

        Collections.sort(list);

        Node newHead = null;
        Node tail = null;

        for (int x : list) {
            Node newNode = new Node(x);

            if (newHead == null) {
                newHead = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return newHead;
    }
}