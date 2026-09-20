class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        Arrays.sort(arr);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(arr[0]);
        al.add(arr[arr.length-1]);
        return al;
    }
}
