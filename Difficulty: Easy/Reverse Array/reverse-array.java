class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int j=0;
        int narr []=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--) {
            narr[j]=arr[i];
            j++;}
        for(int i=0;i<arr.length;i++) 
            arr[i]=narr[i];
            
    }
}