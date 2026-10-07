class Solution {
    public boolean isMajority(int[] arr) {
        // code here
        int n=arr.length/2;
        int c=0;
        int i=0;
        while(i<arr.length){
            if(arr[i]==arr[n]) c++;i++;
            
        }
return c>n;
    }
}