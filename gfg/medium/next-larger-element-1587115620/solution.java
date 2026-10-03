class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        /*ArrayList<Integer> al=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int j=i+1;
        while(j<arr.length){
            if(arr[i]<arr[j]){
                al.add(arr[j]);
                break;}
                j++;
            }
            if(j==arr.length)al.add(-1);
                i++;
                
            }
            return al;
        
    }
}*/
ArrayList<Integer> al=new ArrayList<>();
Stack<Integer> st=new Stack<>();

for(int i=arr.length-1;i>=0;i--){
    while(!st.isEmpty()&&arr[i]>=st.peek())
        st.pop();

    if(st.isEmpty())
        al.add(0,-1);
    else
        al.add(0,st.peek());

    st.push(arr[i]);
}

return al;
}
}