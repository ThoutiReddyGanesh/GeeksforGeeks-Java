class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
        
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot=arr[high];
        int i=low;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                swap(arr,i,j);
                i++;
                
            }
        }
            swap(arr,i,high);
             return i;
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}