class Solution {
    public int countSubarray(int[] arr,int k) {
        int c=0;
        int mod=1000000007;

        for(int i=0;i<arr.length;i++){
            int max=0;

            for(int j=i;j<arr.length;j++){
                max=Math.max(max,arr[j]);

                if(max>k)
                    c=(c+1)%mod;
            }
        }

        return c;
    }
}