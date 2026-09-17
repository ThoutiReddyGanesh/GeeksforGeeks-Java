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
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
                
                Node temp = head;

                while (temp != null) {
                    list.add(temp.data);
                    temp = temp.next;
                }
                if(k>list.size()) return head;


                    Collections.swap(list,k-1,list.size()-k);

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

