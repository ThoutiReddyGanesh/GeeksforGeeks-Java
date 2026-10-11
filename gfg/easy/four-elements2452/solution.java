class Solution{
    public boolean fourSum(int[] arr,int x){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1;
                int r=n-1;
                while(l<r){
                    long sum=(long)arr[i]+arr[j]+arr[l]+arr[r];
                    if(sum==x) return true;
                    else if(sum<x) l++;
                    else r--;
                }
            }
        }
        return false;
    }
}