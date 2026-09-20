class Solution {
    public int getSecondLargest(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();

        for(int x:arr){
            hs.add(x);
        }

       
        ArrayList<Integer> al=new ArrayList<>(hs);
        Collections.sort(al);
         if(al.size()<2)
                     return -1;

        return al.get(al.size()-2);
    }
}