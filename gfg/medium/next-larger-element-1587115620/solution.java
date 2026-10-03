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
 int i=arr.length-1;

 while(i>=0){
     if(st.isEmpty()){
         st.push(arr[i]);
         al.add(-1);
     }
     else if(arr[i]>=st.peek()){
         while(!st.isEmpty()&&arr[i]>=st.peek())
             st.pop();

         if(st.isEmpty())
             al.add(-1);
         else
             al.add(st.peek());

         st.push(arr[i]);
     }
     else{
         al.add(st.peek());
         st.push(arr[i]);
     }
     i--;
 }

 Collections.reverse(al);
 return al;}}