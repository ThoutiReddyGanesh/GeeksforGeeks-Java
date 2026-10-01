class Solution {
    public boolean validateOp(int[] a, int[] b) {
        // code here
      Stack<Integer> st=new Stack<>();
             int i=0;
             int j=0;

             while(i<a.length){
                 st.push(a[i]);

                 while(!st.isEmpty()&&st.peek()==b[j]){
                     st.pop();
                     j++;
                 }

                 i++;
             }

             return st.isEmpty();
         }
     }