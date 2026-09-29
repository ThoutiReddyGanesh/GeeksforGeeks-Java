class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        int i=0;
        int j=arr.length-1;
        int first=-1;
        int last=-1;

        while(i<arr.length){
            if(arr[i]==x){
                first=i;
                break;
            }
            else
                i++;
        }

        while(j>=0){
            if(arr[j]==x){
                last=j;
                break;
            }
            else
                j--;
        }

        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(first);
        ans.add(last);

        return ans;
    }
}