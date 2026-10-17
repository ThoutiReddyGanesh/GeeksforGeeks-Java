class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();

        for(int i=0;i<mat[0].length;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<mat.length;j++){
                temp.add(mat[j][i]);
            }
            al.add(temp);
        }

        return al;
    }
}