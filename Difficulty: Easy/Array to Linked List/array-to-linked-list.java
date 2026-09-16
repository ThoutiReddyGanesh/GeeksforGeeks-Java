/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node (int d) {
       data = d;
       next = null;
    }
};
*/
class Solution {
    public Node arrayToList(int arr[]) {
        // code here
        Node nh=null;
        Node t=null;
        for(int x:arr){
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
