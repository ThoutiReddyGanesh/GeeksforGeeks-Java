class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> al=new ArrayList<>();

        int i=arr.length-1;
        int max=arr[i];
        al.add(max);

        i--;

        while(i>=0){
            if(arr[i]>=max){
                al.add(arr[i]);
                max=arr[i];
            }
            i--;
        }

        Collections.reverse(al);
        return al;
    }
}