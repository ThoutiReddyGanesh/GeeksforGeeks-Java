/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}*/

class myStack {

    Node head;
    int count;

    public myStack() {
        head=null;
        count=0;
    }

    public boolean isEmpty() {
        if(head==null){
            return true;
        }
        return false;
    }

    public void push(int x) {
        Node n=new Node(x);

        if(head==null){
            head=n;
        }
        else{
            n.next=head;
            head=n;
        }

        count++;
    }

    public void pop() {
        if(head==null){
            return;
        }

        head=head.next;
        count--;
    }

    public int peek() {
        if(head==null){
            return -1;
        }

        return head.data;
    }

    public int size() {
        return count;
    }
}