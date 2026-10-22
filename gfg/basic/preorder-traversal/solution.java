class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer>al=new ArrayList<>();
        if(root==null) return al;

        al.add(root.data);
        al.addAll(preOrder(root.left));
        al.addAll(preOrder(root.right));

        return al;
    }
}