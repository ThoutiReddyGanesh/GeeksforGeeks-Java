/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
import java.util.*;

class Solution {
    public Node removeDuplicates(Node head) {
        int n=0;
        Node temp=head;

        while(temp!=null){
            n++;
            temp=temp.next;
        }

        int[] a=new int[n];
        temp=head;
        int i=0;

        while(temp!=null){
            a[i]=temp.data;
            i++;
            temp=temp.next;
        }

        LinkedHashSet<Integer> set=new LinkedHashSet<>();

        for(int x:a){
            set.add(x);
        }

        LinkedList<Integer> list=new LinkedList<>(set);

        Node newHead=null;
        Node tail=null;

        for(int x:list){
            Node newNode=new Node(x);

            if(newHead==null){
                newHead=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }

        return newHead;
    }
}