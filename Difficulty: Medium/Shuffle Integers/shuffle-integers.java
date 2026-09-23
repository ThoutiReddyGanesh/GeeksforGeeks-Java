class Solution {
    public void shuffleArray(int[] arr) {
        // code here
        int i=0;
               int j=arr.length/2;
               int k=0;
               int nums[]=new int[arr.length];
               while(i < arr.length/2){
                    nums[k]=arr[i];
                   k++;
                   nums[k]=arr[j];
                   k++;
                   i++;
                   j++;
               }
               for(int x=0;x<arr.length;x++)
                           arr[x]=nums[x];
           }
       }