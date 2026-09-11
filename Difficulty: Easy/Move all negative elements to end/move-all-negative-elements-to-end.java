class Solution {
    public void segregateElements(int[] arr) {
        int j=0;
        int[] arr2=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                arr2[j]=arr[i];
                j++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr2[j]=arr[i];
                j++;
            }
        }

        for(int i=0;i<arr.length;i++)
            arr[i]=arr2[i];
    }
}