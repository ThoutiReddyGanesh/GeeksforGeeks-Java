class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int e=0;
        int o=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) e++;
            else o++;
        }
        return new int []{o,e};
    }
}