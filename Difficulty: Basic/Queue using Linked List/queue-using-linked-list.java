// Node class
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

// Queue class
class myQueue {

    Node front;
    Node rear;
    int count;

    public myQueue() {
        front=null;
        rear=null;
        count=0;
    }

    public boolean isEmpty() {
        if(front==null){
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        Node n=new Node(x);

        if(front==null){
            front=n;
            rear=n;
        }
        else{
            rear.next=n;
            rear=n;
        }

        count++;
    }

    public void dequeue() {
        if(front==null){
            return;
        }

        front=front.next;
        count--;

        if(front==null){
            rear=null;
        }
    }

    public int getFront() {
        if(front==null){
            return -1;
        }

        return front.data;
    }

    public int size() {
        return count;
    }
}