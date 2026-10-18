class Solution {
    public void rotateArr(int nums[],int k) {
        k=k%nums.length;
        int i=0;
        int j=k-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        i=k;
        j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
        i=0;
        j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}