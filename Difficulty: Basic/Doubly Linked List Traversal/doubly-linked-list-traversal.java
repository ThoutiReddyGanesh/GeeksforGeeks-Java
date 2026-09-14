/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        List<Integer> b=new ArrayList<>();

        Node temp=head;

        while(temp!=null){
            a.add(temp.data);
            temp=temp.next;
        }

        temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        while(temp!=null){
            b.add(temp.data);
            temp=temp.prev;
        }

        ans.add(a);
        ans.add(b);

        return ans;
    }
}